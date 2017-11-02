package music.ui;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author zone
 * @date 2017-11-01
 */
public class MusicPanel extends JPanel {
	public MusicPanel() {
		addButton();
		addRadio();
		addTextArea();
		this.setBounds(0, 0, 420, 480);
		this.setLayout(null);
	}

	private void addTextArea() {
//		JTextArea text = new JTextArea();
//		text.setBounds(0, 140, 420, 280);
//		JScrollPane jsp = new JScrollPane();
//		jsp.setViewportView(text);
//		jsp.setBounds(0, 140, 410, 270);
////		this.add(jsp);
//		this.add(text);
		
		JTextArea txaDisplay = new JTextArea();
		txaDisplay.setBounds(8, 140, 420, 250);
		JScrollPane scroll = new JScrollPane(txaDisplay);
		// 把定义的JTextArea放到JScrollPane里面去

		// 分别设置水平和垂直滚动条自动出现
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.add(txaDisplay);
	}

	private void addRadio() {
		TypeRadioManager typeRadioManager = TypeRadioManager.getManager();
		List<JRadioButton> radioList = typeRadioManager.getRadioList();
		for (JRadioButton radio : radioList) {
			this.add(radio);
		}
	}

	private void addButton() {
		NoteButtonManager noteButtonManager = NoteButtonManager.getManager();
		List<JButton> btnList = noteButtonManager.getNoteButton();
		for (JButton btn : btnList) {
			this.add(btn);
		}
	}
}
