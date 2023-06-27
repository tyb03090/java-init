package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input The Number : ");
		String str = scan.nextLine();
		
		String[] dan = new String[10];
		System.out.println("Input : ");
		
		for(int i = 1; i < 10; i++) {
			dan[i] = i * Integer.parseInt(str) + "";
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i + " X " + str + " = " + dan[i]);
		}

	}

}
