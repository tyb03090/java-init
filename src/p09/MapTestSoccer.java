package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestSoccer {
	
	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap<>();
		m.put("name", "ManUtd.");
		m.put("country", "UK");
		m.put("rank", "3");
		m.put("scored", "75");
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("name", "Hotspur");
		m1.put("country", "UK");
		m1.put("rank", "8");
		m1.put("scored", "60");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("name", "Arsnal");
		m2.put("country", "UK");
		m2.put("rank", "2");
		m2.put("scored", "84");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("name", "Chelsea");
		m3.put("country", "UK");
		m3.put("rank", "12");
		m3.put("scored", "44");
		
		Map<String, String> m4 = new HashMap<>();
		m4.put("name", "Liverpool");
		m4.put("country", "UK");
		m4.put("rank", "5");
		m4.put("scored", "67");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		
		for(Map<String, String> map : mapList) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key) + ",");
			}
		}
		System.out.println();
	}
}
