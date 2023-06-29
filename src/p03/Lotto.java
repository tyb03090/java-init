package p03;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		Random r = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(i != 0 && lotto[j] == lotto[i]) {
					i--;
				}
			}
		}

		for(int i = 0; i < lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
	}

}
