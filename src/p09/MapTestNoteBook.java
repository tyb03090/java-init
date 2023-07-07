package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestNoteBook {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<>();
		m.put("name", "yoga7");
		m.put("company", "lenovo");
		m.put("inch", "14");
		m.put("price", "990000");

		Map<String, String> m1 = new HashMap<>();
		m1.put("name", "galaxybook2");
		m1.put("company", "samsung");
		m1.put("inch", "15.6");
		m1.put("price", "1320000");

		Map<String, String> m2 = new HashMap<>();
		m2.put("name", "macbook air");
		m2.put("company", "apple");
		m2.put("inch", "15.3");
		m2.put("price", "1240000");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("name", "zenbook15");
		m3.put("company", "asus");
		m3.put("inch", "15.3");
		m3.put("price", "1150000");
		
		Map<String, String> m4 = new HashMap<>();
		m4.put("name", "modern15");
		m4.put("company", "msi");
		m4.put("inch", "15.6");
		m4.put("price", "1023000");
		
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
				System.out.println(key + " : " + map.get(key) + ",");
			}
		}
		System.out.println();
	}

}
