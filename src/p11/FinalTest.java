package p11;

class Test{								//class에 final이 붙을 경우, extends이 불가!
	public final void test() {			//method에 final이 붙을 경우, overriding은 불가!
		System.out.println("난 Test꺼!");
	}
}

public class FinalTest extends Test {
	
//	public void test() {
//		System.out.println("난 FinalTest꺼!");
//	}
	
	public static void main(String[] args) {
		
	}
}
