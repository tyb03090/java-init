package p07;

public class FinalTest {
//	int ;								예약어는 변수로 사용할 수 없다.
//	int final;					//		final은 상수로 만들기 때문에 이후에 변수를 지정해도 에러가 생긴다.
	
	final int NUM = 1;			//		메소드 밖에서 final을 사용할 경우, 변수는 무조건 대문자만으로 써야한다.
	final int NUM_TEST = 1;		//		final을 사용할 때, 변수를 두 단어로 구성하고 싶은 경우, 두 단어 사이에 _ 를 넣는다.
	
	public static void main(String[] args) {
		
		final int num = 1;
	}
}
