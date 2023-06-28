package p01;

public class Condition {

	public static void main(String[] args) {	// 변수의 값이 동일한 조건이 여러개이면, 먼저 걸린 조건만이 충족되므로
												// 맨 먼저 걸린 조건문의 println만 출력이 된다
		
		int age = 10;							// 변수 age의 임의의 값을 10으로 설정
		
		if(age == 11) {
			System.out.println("11살");			// age의 값이 11이면, "11살" 이라는 문구가 출력됨
		}else if(age == 10) {
			System.out.println("10살1");			// age의 값이 10이면, "10살1" 이라는 문구가 출력됨
		}else if(age == 10) {
			System.out.println("10살2");			// age의 값이 10이면, "10살2" 이라는 문구가 출력됨
		}else if(age == 10) {
			System.out.println("10살3");			// age의 값이 10이면, "10살3" 이라는 문구가 출력됨
		}
		else {
			System.out.println("11살이 아니군");	// 위의 조건을 모두 충족하지 못했을 때, "11살이 아니군" 이라는 문구가 출력됨
		}

	}

}
