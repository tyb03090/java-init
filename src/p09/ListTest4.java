package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를, 를 기준으로 입력해주세요 : ");
		String numStr = scan.nextLine();
		
		/*
		 * numStr을 ,를 기준으로 배열을 만들고
		 * numList에 추가
		 */
		
		String[] strs = numStr.split(",");
		for(int i = 0; i < strs.length; i++) {
			numList.add(Integer.parseInt(strs[i]));
		}
		System.out.println(numList);
		
		System.out.println("숫자 3개를, 를 기준으로 입력해주세요 : ");
		String numStrs = scan.nextLine();
		
		String[] strz = numStrs.split(",");
		
		int c = 0;
		for(int i = 0; i < strz.length; i++) {
			int num = Integer.parseInt(strz[i]);
			numList.add(num);
			for(int j = 0; j < strz.length; j++) {
				if(numList.indexOf(num) != -1) {
					c++;
				}
			}
		}
		System.out.println(c + "개 맞추셨습니다.");
	}
}
