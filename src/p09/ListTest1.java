package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();

//		for (int i = 1; i < 7; i++) {
//			int rNum = r.nextInt(100) + 1;
//			if (numList.indexOf(rNum) == -1) {
//				numList.add(rNum);
//			} else {
//				i--;
//			}
//		}
		
		while (numList.size() < 6) {
			int rNum = r.nextInt(100) + 1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);

			}
		}
		
		int max = numList.get(0);
		int min = numList.get(0);

		for (int i = 0; i < numList.size(); i++) {
			if (max < numList.get(i)) {
				max = numList.get(i);
			} else if (min > numList.get(i)) {
				min = numList.get(i);
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println(numList);
		/*
		 * 반복문을 6번 돌려서 랜덤값을 numList에 추가 단, 랜덤값은 중복 불가
		 */
	}
}
