package p01;

public class Convert {
	public static void main(String[] args) {
		int i = 1;							// 숫자형의 선언
		String s = "1";						// 문자형의 선언
		
		String s1 = i + "";					// s1에서 숫자형 변수인 i를 문자형으로 바꿔주기 위해 ""를 해줌
		System.out.println(s.equals(s1));	// equals를 사용함으로써 값이 같으면 true, 틀리면 false를 출력하게 해줌
		
		int i1 = Integer.parseInt(s);		// 문자형인 s를 Integer.parseInt를 통해 숫자형으로 변환해줌
		System.out.println(i == i1);		// equals와 비슷한 의미지만, equals가 더 많이 사용됨
		
		String str = "120";					// 120은 숫자이지만, 문자형으로 선언함.
		int i2 = Integer.parseInt(str);		// 문자형으로 선언된 str의 값을 숫자형으로 형변환시켜줌
		System.out.println(i2);				// 숫자형으로 형변환 되었기 때문에 ""를 붙이지 않아도 됨
	}
}
