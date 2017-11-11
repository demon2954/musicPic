package music.listener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JLabel;

import music.constant.Constant;
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
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		int x = ((int) width - 200) / 2;
		int y = ((int) height - 100) / 2;

		JDialog dialog = new JDialog();
		dialog.setLayout(new GridBagLayout());
		dialog.setBounds(x, y, 200, 100);
		JLabel label = new JLabel("成功");
		label.setFont(new Font("宋体", 1, 18));
		dialog.add(label);
		dialog.setVisible(true);
	}

	private String[][] makeMusicalNote(String text) {
		String[][] result = null;
		String[] rows = text.split("\n");
		result = new String[rows.length][];
		for (int i = 0; i < rows.length; i++) {
			String row = rows[i];
			String[] notes = new String[row.length()];
			for (int j = 0; j < row.length(); j++) {
				notes[j] = "" + row.charAt(j);
			}
			result[i] = notes;
		}

		return result;
	}

	public void makePic(String[][] musicalNote, int type) throws Exception {
		int width = 0;
		int height = musicalNote.length;

		for (String[] one : musicalNote) {
			if (width < one.length) {
				width = one.length;
			}
		}

		width *= 95;
		height *= 95;

		File file = new File("d:/image.jpg");

		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D) bi.getGraphics();
		g2.setBackground(Color.WHITE);
		g2.clearRect(0, 0, width, height);
		g2.setPaint(Color.RED);

		int radioType = TypeRadioManager.getManager().getType();
		Map<String, String> noteImgMap = Constant.getNoteImgMap(radioType);

		int x = 0, y = 0;
		for (String[] one : musicalNote) {
			for (String two : one) {
				String imgName = noteImgMap.get(two);
				URL url = GeneralBtnListener.class.getClassLoader().getResource(imgName);
				File filed = new File(url.getFile());

				BufferedImage small = ImageIO.read(filed);

				g2.drawImage(small, x * 95, y * 95, small.getWidth(), small.getHeight(), null);
				x++;
			}
			y++;
			x = 0;
		}
		g2.dispose();

		ImageIO.write(bi, "jpg", file);
	}

}
