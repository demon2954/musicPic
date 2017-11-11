package music.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zone
 * @date 2017-11-11
 */
public class Constant {
	private static Map<Integer, Map<String, String>> typeNoteMap;

	public static Map<String, String> getNoteImgMap(int type) {
		if (typeNoteMap == null) {
			init();
		}
		return typeNoteMap.get(type);
	}

	private static void init() {
		typeNoteMap = new HashMap<>();
		Map<String, String> type1Note = new HashMap<>();
		type1Note.put("①", "image/40-40.png");
		type1Note.put("②", "image/40-40.png");
		type1Note.put("③", "image/40-40.png");
		type1Note.put("④", "image/40-40.png");
		type1Note.put("⑤", "image/40-40.png");
		type1Note.put("⑥", "image/40-40.png");
		type1Note.put("⑦", "image/40-40.png");
		type1Note.put("1", "image/40-40.png");
		type1Note.put("2", "image/40-40.png");
		type1Note.put("3", "image/40-40.png");
		type1Note.put("4", "image/40-40.png");
		type1Note.put("5", "image/40-40.png");
		type1Note.put("6", "image/40-40.png");
		type1Note.put("7", "image/40-40.png");
		type1Note.put("⒈", "image/40-40.png");
		type1Note.put("⒉", "image/40-40.png");
		type1Note.put("⒊", "image/40-40.png");
		type1Note.put("⒋", "image/40-40.png");
		type1Note.put("⒌", "image/40-40.png");
		type1Note.put("⒍", "image/40-40.png");
		type1Note.put("⒎", "image/40-40.png");
		Map<String, String> type2Note = new HashMap<>();
		type2Note.put("①", "image/40-40.png");
		type2Note.put("②", "image/40-40.png");
		type2Note.put("③", "image/40-40.png");
		type2Note.put("④", "image/40-40.png");
		type2Note.put("⑤", "image/40-40.png");
		type2Note.put("⑥", "image/40-40.png");
		type2Note.put("⑦", "image/40-40.png");
		type2Note.put("1", "image/40-40.png");
		type2Note.put("2", "image/40-40.png");
		type2Note.put("3", "image/40-40.png");
		type2Note.put("4", "image/40-40.png");
		type2Note.put("5", "image/40-40.png");
		type2Note.put("6", "image/40-40.png");
		type2Note.put("7", "image/40-40.png");
		type2Note.put("⒈", "image/40-40.png");
		type2Note.put("⒉", "image/40-40.png");
		type2Note.put("⒊", "image/40-40.png");
		type2Note.put("⒋", "image/40-40.png");
		type2Note.put("⒌", "image/40-40.png");
		type2Note.put("⒍", "image/40-40.png");
		type2Note.put("⒎", "image/40-40.png");
		Map<String, String> type3Note = new HashMap<>();
		type3Note.put("①", "image/40-40.png");
		type3Note.put("②", "image/40-40.png");
		type3Note.put("③", "image/40-40.png");
		type3Note.put("④", "image/40-40.png");
		type3Note.put("⑤", "image/40-40.png");
		type3Note.put("⑥", "image/40-40.png");
		type3Note.put("⑦", "image/40-40.png");
		type3Note.put("1", "image/40-40.png");
		type3Note.put("2", "image/40-40.png");
		type3Note.put("3", "image/40-40.png");
		type3Note.put("4", "image/40-40.png");
		type3Note.put("5", "image/40-40.png");
		type3Note.put("6", "image/40-40.png");
		type3Note.put("7", "image/40-40.png");
		type3Note.put("⒈", "image/40-40.png");
		type3Note.put("⒉", "image/40-40.png");
		type3Note.put("⒊", "image/40-40.png");
		type3Note.put("⒋", "image/40-40.png");
		type3Note.put("⒌", "image/40-40.png");
		type3Note.put("⒍", "image/40-40.png");
		type3Note.put("⒎", "image/40-40.png");
		typeNoteMap.put(1, type1Note);
		typeNoteMap.put(2, type2Note);
		typeNoteMap.put(3, type3Note);
	}
}
