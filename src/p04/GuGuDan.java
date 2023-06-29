package p04;

public class GuGuDan {
	
	public static void gugudan(int dan) {
		
		int[][] ggd = new int[100][100];
		
		for(int i = 1; i < dan; i++) {
			for(int j = 1; j < dan; j++) {
				
				int gugudan = i * j;
				
				System.out.println(i + " x " + j + " = " + gugudan);
			}
		}
	}

	public static void main(String[] args) {
		gugudan(9);
		
	}
}
