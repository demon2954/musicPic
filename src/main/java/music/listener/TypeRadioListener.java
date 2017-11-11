package music.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	}
	
	public TypeRadioListener(String type) {
		this.type = Integer.parseInt(type);
	}

}
