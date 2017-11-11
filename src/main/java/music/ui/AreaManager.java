package music.ui;

import java.awt.Font;

import javax.swing.JTextArea;

/**
 * @author zone
 * @date 2017-11-11
 */
public class AreaManager {
	private JTextArea area = null;

	private static AreaManager areaManager;

	private AreaManager() {
		area = new JTextArea();
		Font font = new Font("宋体", Font.PLAIN, 18);
		area.setFont(font);
	}

	public JTextArea getArea() {
//		area.setEditable(false);
		
		return area;
	}

	public static AreaManager getManager() {
		if (areaManager == null) {
			areaManager = new AreaManager();
		}
		return areaManager;
	}

	public void addNote(String note) {
		String text = area.getText();
		text += note;
		area.setText(text);
	}
}
