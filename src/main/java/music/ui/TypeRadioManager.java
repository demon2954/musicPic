package music.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JRadioButton;

/**
 * @author zone
 * @date 2017-11-02
 */
public class TypeRadioManager {

	private static TypeRadioManager typeRadioManager;
	private List<JRadioButton> radioList = null;

	private TypeRadioManager() {
		radioList = new ArrayList<>();
		JRadioButton type1 = new JRadioButton("全按为 1");
		type1.setBounds(320, 0, 80, 30);
		radioList.add(type1);
		
		JRadioButton type2 = new JRadioButton("全按为.4");
		type2.setBounds(320, 30, 80, 30);
		radioList.add(type2);
		
		JRadioButton type3 = new JRadioButton("全按为.5");
		type3.setBounds(320, 60, 80, 30);
		radioList.add(type3);
	}

	public List<JRadioButton> getRadioList() {
		return radioList;
	}
	

	public static TypeRadioManager getManager() {
		if (typeRadioManager == null) {
			typeRadioManager = new TypeRadioManager();
		}
		return typeRadioManager;
	}
}
