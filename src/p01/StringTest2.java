package p01;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "kim-yong-jun";
		
		char c = str.charAt(6);
		System.out.println(c);
		
		String s1 = "k";
		String s2 = "k";
		System.out.println(s1 == s2);
		
		String s3 = new String("k");
		System.out.println(s1 == s3);

		String s4 = new String("k");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		int idx = str.indexOf("y");
		System.out.println(idx);
		
		int idx2 = str.indexOf("j");
		System.out.println(idx2);
		
		String str2 = str.substring(idx, idx2);
		System.out.println(str2);
		str2 = str.replace("kim", "김");
		System.out.println(str2);
		
		String name = "yong";
		name = name.toUpperCase();
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
	}

}
