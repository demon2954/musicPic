package music.ui;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import music.listener.GeneralBtnListener;
import music.listener.NoteBtnListener;

/**
 * @author zone
 * @date 2017-11-01
 */
public class MusicBtnPanel extends JPanel {
	public MusicBtnPanel() {
		addButton();
		addRadio();
		this.setBounds(0, 0, 420, 480);
		this.setLayout(null);
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
			if (btn.getText().equals("生成")) {
				btn.addActionListener(new GeneralBtnListener());
			} else {
				btn.addActionListener(new NoteBtnListener(btn.getText()));
			}
			this.add(btn);
		}
	}
}
