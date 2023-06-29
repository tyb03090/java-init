package p03;

public class TwoArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		
		System.out.println(numsArray.length);
		
//		int c = 0;
		
		for(int i = 0; i < numsArray.length; i++) {
//			System.out.println(numsArray[i].length);
			for(int j = 0; j < numsArray[i].length; j++) {
//				c++;
//				numsArray[i][j] = c;
				numsArray[i][j] = numsArray[i][j] + 1 * 2;
			}
		}
		
		for(int i = 0; i < numsArray.length; i++) {
			for(int j = 0; j < numsArray[i].length; j++) {
				System.out.print("[" + numsArray[i][j] + "]");
			}
		}
	}
}

