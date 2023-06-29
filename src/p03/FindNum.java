package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean correct = false;
		Random r = new Random();
		int rNum = r.nextInt(10) + 1;
		int c = 0;
		
		while(!correct) {
			System.out.println("1~10의 숫자를 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine());
			
			c++;
			
			correct = rNum == inputNum;
		}
		System.out.println("와 맞췄다!\n맞춘 횟수 : " + c);
	}

}
