package p04;

class Test{
	public static int getNum() {
		return 1;
	}
	public static int getNum2() {
		return 2;
	}
}

public class MethodTest {
	
	public static int getNum() {
		return 0;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = Test.getNum();
	}
}
