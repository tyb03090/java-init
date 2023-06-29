package p04;

import java.util.Random;
import java.util.Scanner;

public class getRock {
	public static String getRock() {
		Random r = new Random();
		int rNum = r.nextInt(3) + 1;
		if(rNum == 1) {
			return "가위";
		}
		if(rNum == 2) {
			return "바위";
		}
		if(rNum == 3) {
			return "보";
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		String rock = getRock();
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보 : ");
		
		String urRock = scan.nextLine();
		
		if(rock.equals(urRock)) {
			System.out.println("비겼다!");
		}else if("가위".equals(urRock)) {
			if("바위".equals(rock)) {
				System.out.println("졌다!");
			}else if("보".equals(rock)) {
				System.out.println("이겼다!");
			}
		}else if("바위".equals(urRock)) {
			if("보".equals(rock)) {
				System.out.println("졌다!");
			}else if("가위".equals(rock)) {
				System.out.println("이겼다!");
			}
		}else if("보".equals(urRock)) {
			if("가위".equals(rock)) {
				System.out.println("졌다!");
			}else if("바위".equals(rock)) {
				System.out.println("이겼다!");
			}
		}
		}
}
