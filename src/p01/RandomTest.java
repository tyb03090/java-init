package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();				// Random 데이터 타입의 메모리를 새로 생성함
		int i = r.nextInt(10) + 1;				// i를 0~9중 랜덤하게 출력함 1~10을 출력해야하기에 +1을 해줌
		System.out.println(i);
		int i2 = r.nextInt(10) + 1;
		System.out.println(i2);
		int i3 = r.nextInt(10) + 1;
		System.out.println(i3);

		int[] rand = new int[3];				// 배열 길이가 3인 int배열을 생성함
		
		for(i = 0; i < 3; i++) {				// i가 0부터 2까지 3번 반복됨
			rand[i] = r.nextInt(10) + 1;		// 0번째 부터 2번째 배열에 1~10중에 랜덤한 수를 넣음
		}
		for(i = 0; i < 3; i++) {
			System.out.println(rand[i]);
		}
	}

}
