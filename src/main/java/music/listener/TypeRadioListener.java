package music.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import music.constant.Constant;
import music.ui.NoteButtonManager;
import music.ui.TypeRadioManager;

/**
 * @author zone
 * @date 2017-11-11
 */
public class TypeRadioListener implements ActionListener{

	private int type; 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TypeRadioManager.getManager().selectType(type);

		String usableNote = Constant.getTypeNoteUnableMap(type);
		List<JButton> noteBtns = NoteButtonManager.getManager().getNoteButton();
		for (JButton one : noteBtns) {
			one.setEnabled(true);
		}
		for (JButton one : noteBtns) {
			if (usableNote.contains(one.getText())) {
				one.setEnabled(false);
			}
		}
	}
	
	public TypeRadioListener(String type) {
		this.type = Integer.parseInt(type);
	}

}
