package p09;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(3);
		numList.add(22);
		numList.add(15);
		numList.add(29);
		
		for(int i = 0; i < numList.size(); i++) {
			for(int j = i + 1; j < numList.size(); j++) {
				if(numList.get(i) > numList.get(j)) {
					int tmp = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, tmp);
				}
			}
		}
		System.out.println(numList);
	}
}
