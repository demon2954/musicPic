package music.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import music.ui.MusicFrame;
import music.ui.MusicPanel;

/**
 * @auth zone
 * @date 2017-11-01
 */
public class Main {
	public static void main(String[] args) throws Exception {
//		String[][] musicalNote = { { "1", "2" }, { "1", "2", "1" }, { "1", "2", "1", "1", "2", "1" } };
//		makePic(musicalNote, 1);
		
		runUI();
	}
	
	private static void runUI() {
		MusicFrame frame = new MusicFrame();
		MusicPanel panel = new MusicPanel();
		frame.add(panel);
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
