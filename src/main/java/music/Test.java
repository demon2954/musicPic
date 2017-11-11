package music;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author zone
 * @date 2017-11-10
 */
public class Test extends JFrame {

	public void setImage() {
		JTextArea ja;
		JScrollPane jsp;
		ja = new JTextArea();
		jsp = new JScrollPane(ja);
		
		JButton jbtn = new JButton("dd");
		
		this.add(jbtn);
		this.add(jsp);
		this.setSize(200, 200);
		this.setLayout(new GridLayout());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Test a = new Test();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setImage();
	}
}