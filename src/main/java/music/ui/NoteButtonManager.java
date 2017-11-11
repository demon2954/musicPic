package music.ui;

import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

/**
 * @author zone
 * @date 2017-11-01
 */
public class NoteButtonManager {
	private List<JButton> noteButton = null;

	private static NoteButtonManager noteButtonManager;

	private NoteButtonManager() {
		int size = 45;
		noteButton = new ArrayList<>();

		int x = 0;
		JButton note11 = new JButton("①");
		note11.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note11);

		JButton note12 = new JButton("②");
		note12.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note12);

		JButton note13 = new JButton("③");
		note13.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note13);

		JButton note14 = new JButton("④");
		note14.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note14);

		JButton note15 = new JButton("⑤");
		note15.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note15);

		JButton note16 = new JButton("⑥");
		note16.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note16);

		JButton note17 = new JButton("⑦");
		note17.setBounds((x++) * size+5, 0, size, size);
		noteButton.add(note17);

		x = 0;
		JButton note21 = new JButton("1");
		note21.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note21);

		JButton note22 = new JButton("2");
		note22.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note22);

		JButton note23 = new JButton("3");
		note23.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note23);

		JButton note24 = new JButton("4");
		note24.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note24);

		JButton note25 = new JButton("5");
		note25.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note25);

		JButton note26 = new JButton("6");
		note26.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note26);

		JButton note27 = new JButton("7");
		note27.setBounds((x++) * size+5, size, size, size);
		noteButton.add(note27);

		x = 0;
		JButton note31 = new JButton("⒈");
		note31.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note31);

		JButton note32 = new JButton("⒉");
		note32.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note32);

		JButton note33 = new JButton("⒊");
		note33.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note33);

		JButton note34 = new JButton("⒋");
		note34.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note34);

		JButton note35 = new JButton("⒌");
		note35.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note35);

		JButton note36 = new JButton("⒍");
		note36.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note36);

		JButton note37 = new JButton("⒎");
		note37.setBounds((x++) * size+5, size * 2, size, size);
		noteButton.add(note37);
		
		JButton enter = new JButton("换行");
		enter.setBounds(322, size * 2, 80, size/2);
		noteButton.add(enter);

		JButton general = new JButton("生成");
		general.setBounds(322, size * 2 + size / 2, 80, size / 2);
		noteButton.add(general);
	}

	public List<JButton> getNoteButton() {
		Font font = new Font("宋体", Font.PLAIN, 18);
		Insets insets = new Insets(0, 0, 0, 0);
		for (JButton one : noteButton) {
			one.setMargin(insets);
			one.setFont(font);
		}
		return noteButton;
	}

	public static NoteButtonManager getManager() {
		if (noteButtonManager == null) {
			noteButtonManager = new NoteButtonManager();
		}
		return noteButtonManager;
	}

}
