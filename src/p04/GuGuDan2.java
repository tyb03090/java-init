package p04;

public class GuGuDan2 {

	public static void printGuGuDan(int firstDan, int secondDan) {
		
		for(int i = 1; i <= firstDan; i++) {
			for(int j = 1; j <= secondDan; j++) {
				
				int gugudan = i * j;
				
				System.out.println(i + " x " + j + " = " + gugudan);
			}
		}
	}
	
	public static void main(String[] args) {
		printGuGuDan(9, 10);
	}

}
