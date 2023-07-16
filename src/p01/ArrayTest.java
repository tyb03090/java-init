package p01;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];		// 6개의 길이인 int배열을 설정
		
		System.out.println(lotto[0]);	// 6개의 배열 중, 0번 주소의 값을 불러옴
		System.out.println(lotto[1]);	// 6개의 배열 중, 1번 주소의 값을 불러옴
		System.out.println(lotto[2]);	// 6개의 배열 중, 2번 주소의 값을 불러옴
		System.out.println(lotto[3]);	// 6개의 배열 중, 3번 주소의 값을 불러옴
		System.out.println(lotto[4]);	// 6개의 배열 중, 4번 주소의 값을 불러옴
		System.out.println(lotto[5]);	// 6개의 배열 중, 5번 주소의 값을 불러옴
		
		lotto[0] = 1;					// 주소의 값을 불러오는 작업이 먼저였기 때문에, 선언을 해줘도 출력은 0이 됨
		lotto = new int[5];				// 
		
		int i = 0;						// 
		
	}

}
