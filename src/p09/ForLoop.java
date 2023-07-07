package p09;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("이원기");
		strList.add("김용준");
		strList.add("이명관");
		strList.add("이보성");
		strList.add("이원준");
		strList.add("이왕균");
		
		for(int i = 0; i < strList.size(); i++) {
			String name = strList.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		for(String name : strList) {						// 향상된 for문.
			System.out.println(name);						
		}
	}
}
