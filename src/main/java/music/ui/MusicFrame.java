package music.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @auth zone
 * @date 2017-11-01
 */
public class MusicFrame extends JFrame {
	public MusicFrame() {
		super("陶笛图生成器");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		int x = ((int) width - 480) / 2;
		int y = ((int) height - 640) / 2;
		this.setBounds(x, y, 640, 480);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
	}
}
