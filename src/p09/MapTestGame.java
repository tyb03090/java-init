package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestGame {

	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap<>();
		m.put("game", "Terraria");
		m.put("genre", "sandbox");
		m.put("price", "10500");
		m.put("rank", "6");
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("game", "Minecraft");
		m1.put("genre", "sandbox");
		m1.put("price", "33000");
		m1.put("rank", "1");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("game", "Left4Dead");
		m2.put("genre", "fps");
		m2.put("price", "4300");
		m2.put("rank", "10");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("game", "Diablo4");
		m3.put("genre", "mmorpg");
		m3.put("price", "26500");
		m3.put("rank", "2");
		
		Map<String, String> m4 = new HashMap<>();
		m4.put("game", "Doom");
		m4.put("genre", "fps");
		m4.put("price", "40000");
		m4.put("rank", "9");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);

		for(int i = 0; i < mapList.size(); i++) {
			Map<String, String> map = mapList.get(i);
			Iterator<String> it = map.keySet().iterator();
			
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key) + ", ");
			}
		}
		System.out.println();
	}
}
