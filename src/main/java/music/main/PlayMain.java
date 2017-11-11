package music.main;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author zone
 * @date 2017-11-02
 */
public class PlayMain {

	public static void main(String[] args) {
		// play();
		test();
	}

	private static void test() {
		JTextArea txaDisplay = new JTextArea();
		JScrollPane scroll = new JScrollPane(txaDisplay);
		// 把定义的JTextArea放到JScrollPane里面去

		// 分别设置水平和垂直滚动条总是出现
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	}

	public static void play() {
		try {
			// Get a sequencer and open it
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4); // Treat the arguments as Ready-bake arguments

			Track track = seq.createTrack(); // Ask the sequence for a track

			// Put some MidiEvents into the Track, the setMessage() method is what we should
			// really care
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);

			player.setSequence(seq); // Give the sequence to the Sequencer
										// like pushing a CD to a CD player

			player.start(); // Start the sequencer like pushing PLAY
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}  