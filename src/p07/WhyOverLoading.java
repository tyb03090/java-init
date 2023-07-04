package p07;

public class WhyOverLoading {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println('1');
		System.out.println("1");
		System.out.println(1.1);
		System.out.println(1.1F);
		System.out.println((short)1);
		
		WhyOverLoading wol = new WhyOverLoading();
		System.out.println(wol);
	}
}
