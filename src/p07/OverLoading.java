package p07;

public class OverLoading {
	
	public void test() {
		System.out.println("test() 호출");
	}
	
	public void test(byte bt) {
		System.out.println("test(byte bt) 호출");
	}
	
	public void test(short s) {
		System.out.println("test(short s) 호출");
	}
	
	public void test(int num) {					// private은 같은 클래스 내에서만 사용이 가능하다.
		System.out.println("test(int num) 호출");
	}
	
	public void test(long l) {
		System.out.println("test(long l) 호출");
	}
	
	public void test(float f) {
		System.out.println("test(float f) 호출");
	}
	
	public void test(double db) {
		System.out.println("test(double db) 호출");
	}
	
	public void test(char c) {
		System.out.println("test(char c) 호출");
	}
	
	public void test(String str) {
		System.out.println("test(String str) 호출");
	}
	
	public void test(boolean bl) {
		System.out.println("test(boolean bl) 호출");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		
		
		ol.test("2");
		ol.test(2);
		ol.test(2.2);
	}
}
