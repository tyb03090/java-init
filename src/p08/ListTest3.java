package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		/*
		 * Collection Framework
		 * List, Map, Set : Interface
		 */
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("안녕");
		System.out.println(strList1.get(0));
		strList1.remove(0);
		System.out.println(strList1.get(0));
	}
}
