package p02;

public class ForLoop {

	public static void main(String[] args) {
		String[] strs = new String[10];
		int i;
		
		for(i = 1; i < 10; i++) {
			strs[i] = i + "";
		}
		
		for(i = 1; i < 10; i++) {
			System.out.println("1 X " + strs[i] + " = " + strs[i]);
		}
		
		for(i = 9; i >= 0; i--) {
			System.out.println(strs[i] + " X 1 = " + strs[i]);
		}
		
	}

}
