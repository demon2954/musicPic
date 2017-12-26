package music.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zone
 * @date 2017-11-11
 */
public class Constant {
	private static Map<Integer, Map<String, String>> typeNoteMap;
	
	//选取type是对应置灰的按钮
	private static Map<Integer, String> typeNoteUnableMap;

	public static Map<String, String> getNoteImgMap(int type) {
		if (typeNoteMap == null) {
			init();
		}
		return typeNoteMap.get(type);
	}

	public static String getTypeNoteUnableMap(int type) {
		if (typeNoteUnableMap == null) {
			init();
		}
		return typeNoteUnableMap.get(type);
	}

	private static void init() {
		typeNoteMap = new HashMap<>();
		Map<String, String> type1Note = new HashMap<>();
		type1Note.put("①", "image/1/+1.jpg");
		type1Note.put("②", "image/1/+2.jpg");
		type1Note.put("③", "image/1/+3.jpg");
		type1Note.put("④", "image/1/+4.jpg");
		type1Note.put("⑤", "image/blank.jpg");
		type1Note.put("⑥", "image/blank.jpg");
		type1Note.put("⑦", "image/blank.jpg");
		type1Note.put("1", "image/1/1.jpg");
		type1Note.put("2", "image/1/2.jpg");
		type1Note.put("3", "image/1/3.jpg");
		type1Note.put("4", "image/1/4.jpg");
		type1Note.put("5", "image/1/5.jpg");
		type1Note.put("6", "image/1/6.jpg");
		type1Note.put("7", "image/1/7.jpg");
		type1Note.put("⒈", "image/blank.jpg");
		type1Note.put("⒉", "image/blank.jpg");
		type1Note.put("⒊", "image/blank.jpg");
		type1Note.put("⒋", "image/blank.jpg");
		type1Note.put("⒌", "image/blank.jpg");
		type1Note.put("⒍", "image/1/-6.jpg");
		type1Note.put("⒎", "image/1/-7.jpg");
		Map<String, String> type2Note = new HashMap<>();
		type2Note.put("①", "image/blank.jpg");
		type2Note.put("②", "image/blank.jpg");
		type2Note.put("③", "image/blank.jpg");
		type2Note.put("④", "image/blank.jpg");
		type2Note.put("⑤", "image/blank.jpg");
		type2Note.put("⑥", "image/blank.jpg");
		type2Note.put("⑦", "image/blank.jpg");
		type2Note.put("1", "image/-4/1.jpg");
		type2Note.put("2", "image/-4/2.jpg");
		type2Note.put("3", "image/-4/3.jpg");
		type2Note.put("4", "image/-4/4.jpg");
		type2Note.put("5", "image/-4/5.jpg");
		type2Note.put("6", "image/-4/6.jpg");
		type2Note.put("7", "image/-4/7.jpg");
		type2Note.put("⒈", "image/blank.jpg");
		type2Note.put("⒉", "image/-4/-2.jpg");
		type2Note.put("⒊", "image/-4/-3.jpg");
		type2Note.put("⒋", "image/-4/-4.jpg");
		type2Note.put("⒌", "image/-4/-5.jpg");
		type2Note.put("⒍", "image/-4/-6.jpg");
		type2Note.put("⒎", "image/-4/-7.jpg");
		Map<String, String> type3Note = new HashMap<>();
		type3Note.put("①", "image/-5/+1.jpg");
		type3Note.put("②", "image/blank.jpg");
		type3Note.put("③", "image/blank.jpg");
		type3Note.put("④", "image/blank.jpg");
		type3Note.put("⑤", "image/blank.jpg");
		type3Note.put("⑥", "image/blank.jpg");
		type3Note.put("⑦", "image/blank.jpg");
		type3Note.put("1", "image/-5/1.jpg");
		type3Note.put("2", "image/-5/2.jpg");
		type3Note.put("3", "image/-5/3.jpg");
		type3Note.put("4", "image/-5/4.jpg");
		type3Note.put("5", "image/-5/5.jpg");
		type3Note.put("6", "image/-5/6.jpg");
		type3Note.put("7", "image/-5/7.jpg");
		type3Note.put("⒈", "image/blank.jpg");
		type3Note.put("⒉", "image/blank.jpg");
		type3Note.put("⒊", "image/-5/-3.jpg");
		type3Note.put("⒋", "image/-5/-4.jpg");
		type3Note.put("⒌", "image/-5/-5.jpg");
		type3Note.put("⒍", "image/-5/-6.jpg");
		type3Note.put("⒎", "image/-5/-7.jpg");
		typeNoteMap.put(1, type1Note);
		typeNoteMap.put(2, type2Note);
		typeNoteMap.put(3, type3Note);
		
		typeNoteUnableMap = new HashMap<>();
		String type1NoteUnable = "⑤⑥⑦⒈⒉⒊⒋⒌";
		typeNoteUnableMap.put(1, type1NoteUnable);
		String type2NoteUnable = "①②③④⑤⑥⑦⒈";
		typeNoteUnableMap.put(2, type2NoteUnable);
		String type3NoteUnable = "②③④⑤⑥⑦⒈⒉";
		typeNoteUnableMap.put(3, type3NoteUnable);
	}
}
