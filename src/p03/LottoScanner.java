package p03;

import java.util.Random;
import java.util.Scanner;

public class LottoScanner {
	public static void main(String[] args) {
		/*
		 * int[] lotto = new int[6]; <-- 만들어서
		 * 랜덤이던 매쓰던 로또번호를 6개 만들어서 위에 넣으세요.
		 */
		
		int[] lotto = new int[6];
		Random r = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(6) + 1;
		}

		System.out.println("숫자를 입력하세요. : ");
		
		Scanner scan = new Scanner(System.in);
		String lottoStr = scan.nextLine();
		String[] str = lottoStr.split(",");
		
		int c = 0;
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(lotto[j] == Integer.parseInt(str[i])) {
					c++;
				}
			}
		}
		System.out.println(c + "개 맞추셨습니다.");
	}
}
