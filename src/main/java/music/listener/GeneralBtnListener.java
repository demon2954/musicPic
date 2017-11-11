package music.listener;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import music.ui.AreaManager;
import music.ui.TypeRadioManager;

/**
 * @author zone
 * @date 2017-11-11
 */
public class GeneralBtnListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		AreaManager area = AreaManager.getManager();
		String text = area.getArea().getText();
		
		int type = TypeRadioManager.getManager().getType();
		
		try {
			makePic(makeMusicalNote(text), type);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private String[][] makeMusicalNote(String text){
		String[][] result = null;
		String[] rows = text.split("\n");
		result = new String[rows.length][];
		for (int i = 0; i < rows.length; i++) {
			String row = rows[i];
			String[] notes = new String[row.length()];
			for (int j = 0; j < row.length(); i++) {
				notes[j] = "" + row.charAt(j);
			}
			result[i] = notes;
		}
		
		return result;
	}
	
	public static void makePic(String[][] musicalNote, int type) throws Exception {
		int width = 0;
		int height = musicalNote.length;

		for (String[] one : musicalNote) {
			if (width < one.length) {
				width = one.length;
			}
		}

		width *= 40;
		height *= 40;

		File file = new File("d:/image.jpg");

		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D) bi.getGraphics();
		g2.setBackground(Color.WHITE);
		g2.clearRect(0, 0, width, height);
		g2.setPaint(Color.RED);

		String smallPath = "D:/workspace/exam/music/src/main/resources/image/40-40.png";
		BufferedImage small = ImageIO.read(new File(smallPath));
		
		int x = 0, y = 0;
		for (String[] one : musicalNote) {
			for (String two : one) {
				g2.drawImage(small, x * 40, y * 40, small.getWidth(), small.getHeight(), null);
				x++;
			}
			y++;
			x = 0;
		}
		g2.dispose();

		ImageIO.write(bi, "jpg", file);
	}

}
