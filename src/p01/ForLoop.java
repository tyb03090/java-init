package p01;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 1) {						// for문에서 계속 증가되는 i값을 2로 나누었을 때 나머지가 1인, 즉 홀수 
				System.out.println(i);
			}
		}
		
		for(int i = 2; i <= 10; i += 2) {			// i가 2에서 시작해 10까지 2씩 증가하게 됨, 즉 짝수
			System.out.println(i);
		}

	}

}
