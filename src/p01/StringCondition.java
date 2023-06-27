package p01;

public class StringCondition {

	public static void main(String[] args) {
		String s1 = "123";
		
		if(s1 == "123")
		{
			System.out.println("s1은 123");
		}else {
			System.out.println("s1은 123이 아님");
		}
		
		String s2 = new String("123");
		if(s2 == "123") {
			System.out.println("s2는 123");
		}else {
			System.out.println("s2는 123이 아님");
		}
		
		String s4 = "  123 ";
		System.out.println(s4);
		System.out.println(s4.trim().equals("123"));
		
		String s5 = new String("1");
		System.out.println("1".equals(s5));
		System.out.println(s5.equals("1"));

		String s6 = null;
		System.out.println("1".equals(s6));
		System.out.println(s6.equals("1"));
	}

}
