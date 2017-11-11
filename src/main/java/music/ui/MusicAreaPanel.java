package music.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author zone
 * @date 2017-11-11
 */
public class MusicAreaPanel extends JPanel {
	public MusicAreaPanel() {
		JTextArea ja;
		JScrollPane jsp;
		ja = new JTextArea();
		jsp = new JScrollPane(ja);
//
//		this.setSize(200, 200);
		this.add(jsp);
		
		this.add(new JButton());
		this.setLayout(new BorderLayout());
//		this.setVisible(true);
		this.setSize(200, 200);
		this.setBackground(Color.BLACK);
	
	}
}
