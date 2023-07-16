package p01;

import java.util.Scanner;

public class DataType2 {

	public static void main(String[] args) {
		
		String str = "1234";						// 문자형 str의 값을 선언해줌
		
		System.out.println(str.length());			// 문자형 str의 길이를 출력함
		System.out.println(str.substring(1));		// 앞에서부터 n개를 자름 => 234
		System.out.println(str.substring(1, 3));	// 앞에서부터 m개 자르고, n번째 자리에 있는 문자를 자름 => 23
		
		int idx = str.indexOf("3");					// 인덱스 번호를 호출하는 걸 선언해줌
		System.out.println("3의 index : " + idx);	// 선언해준 변수를 호출
		
		idx = str.indexOf("5");						//
		System.out.println("5의 index : " + idx);	//
		
		Scanner scan = new Scanner(System.in);		// Scanner 데이터 타입을 통해 입력할 수 있게 함

	}

}
