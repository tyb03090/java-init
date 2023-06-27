package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1~9까지 숫자를 입력하시오 : ");
		String numStr = scan.nextLine();
		
		String[] dan = new String[10];
		System.out.println("입력된 숫자 : " + numStr);
		
		for(int i = 1; i < 10; i++) {
			dan[i] = i * Integer.parseInt(numStr) + "";
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.println(numStr + " X " + i + " = " + dan[i]);
		}

	}

}
