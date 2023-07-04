package p06;

import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {

	public static void main(String[] args) {

		int[] nums = new int[3];
		Random r = new Random();
		boolean correct = false;

		for (int i = 0; i < nums.length; i++) {
			int rNum = r.nextInt(9);

			for (int j = 0; j < i; j++) {
				if (nums[j] == rNum) {
					i--;
					break;
				}
			}
		}

		nums = new int[] { 5, 0, 1 };
		Scanner scan = new Scanner(System.in);
		System.out.println("너가 생각하는 숫자를 ,를 기준으로 3개만 말해봐 : ");

		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		int[] compNums = new int[numStrs.length];

		
			for (int i = 0; i < numStrs.length; i++) {
				compNums[i] = Integer.parseInt(numStrs[i]);
			}

			int strike = 0;
			int ball = 0;
			while (!numStrs.equals(compNums)) {
			for (int i = 0; i < numStrs.length; i++) {
				for (int j = 0; j < compNums.length; j++) {
					if (nums[i] == compNums[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
						
						break;
					}
				}
			}
		}
		System.out.println(strike + "Strike, " + ball + "Ball");

	}
}
