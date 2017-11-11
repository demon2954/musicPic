package music.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JRadioButton;

import music.listener.TypeRadioListener;

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
		type1.setName("1");
		type1.setBounds(320, 0, 80, 30);
		type1.setSelected(true);
		type1.addActionListener(new TypeRadioListener(type1.getName()));
		radioList.add(type1);
		
		JRadioButton type2 = new JRadioButton("全按为.4");
		type2.setName("2");
		type2.setBounds(320, 30, 80, 30);
		type2.addActionListener(new TypeRadioListener(type2.getName()));
		radioList.add(type2);
		
		JRadioButton type3 = new JRadioButton("全按为.5");
		type3.setName("3");
		type3.setBounds(320, 60, 80, 30);
		type3.addActionListener(new TypeRadioListener(type3.getName()));
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
	
	public int getType() {
		for (JRadioButton one : radioList) {
			if (one.isSelected()) {
				return Integer.parseInt(one.getName());
			}
		}
		return 1;
	}
	
	public void selectType(int type) {
		for (JRadioButton one : radioList) {
			if (one.getName().equals(type + "")) {
				one.setSelected(true);
			} else {
				one.setSelected(false);
			}
		}
	}
	
}
