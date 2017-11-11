package music.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author zone
 * @date 2017-11-01
 */
public class MusicFrame extends JFrame {
	public MusicFrame() {
		super("陶笛图生成器");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		int x = ((int) width - 480) / 2;
		int y = ((int) height - 420) / 2;

		this.setLayout(new GridLayout(2, 1));
		MusicBtnPanel btnPanel = new MusicBtnPanel();
		this.add(btnPanel);
		
		AreaManager areaManager = AreaManager.getManager();
		JScrollPane jsp = new JScrollPane(areaManager.getArea());
		this.add(jsp);
		
		this.setBounds(x, y, 420, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
	}
}
