package music.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import music.ui.AreaManager;

/**
 * @author zone
 * @date 2017-11-11
 */
public class NoteBtnListener implements ActionListener {
	private String note;

	@Override
	public void actionPerformed(ActionEvent e) {
		AreaManager area = AreaManager.getManager();
		area.addNote(note);
	}

	public NoteBtnListener(String note) {
		if ("换行".equals(note)) {
			note = "\n";
		}
		this.note = note;
	}

}
