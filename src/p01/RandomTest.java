package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(10) + 1;
		System.out.println(i);
		int i2 = r.nextInt(10) + 1;
		System.out.println(i2);
		int i3 = r.nextInt(10) + 1;
		System.out.println(i3);

		int[] rand = new int[3];
		
		for(i = 0; i < 3; i++) {
			rand[i] = r.nextInt(10) + 1;
		}
		for(i = 0; i < 3; i++) {
			System.out.println(rand[i]);
		}
	}

}
