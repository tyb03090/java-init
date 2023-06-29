package p03;

public class Lotto3 {
	public static void main(String[] args) {
		String lottoStr = "1, 32, 44, 15, 17";
		String[] strs = lottoStr.split(", ");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
