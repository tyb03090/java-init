package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {
	/*
	 * numList의 size가 20이 될떄까지
	 * 랜덤값을 1~100까지 추가
	 * 단, 중복은 안됨.
	 * 
	 * 반복문 사용해서 1개씩 출력
	 * 숫자에 3, 6, 9가 있으면 짝을 출력하셈
	 */

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
		while(numList.size() < 20) {
			int rNum = r.nextInt(100) + 1;
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		
		for(int i = 0; i < numList.size(); i++) {
			int num = numList.get(i) / 10;
			int num1 = numList.get(i) % 10;
			
			if(num != 0 && num % 3 == 0 || num1 != 0 && num1 % 3 == 0) {
				if(num != 0 && num % 3 == 0 && num1 != 0 && num1 % 3 == 0) {
					System.out.println(numList.get(i) + " 짝짝");
				}else {
					System.out.println(numList.get(i) + " 짝");
				}
				
			}else {
				System.out.println(numList.get(i));
			}
		}
		System.out.println();
		
		for(int i = 0; i < numList.size(); i++) {
			String numStr = numList.get(i).toString();
			numStr = numStr.replace("3", "짝");
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			
			
			System.out.println(numList.get(i) + " : " + numStr);
		}
	}
}
