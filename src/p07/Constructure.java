package p07;

import java.util.Scanner;

public class Constructure {

	public Constructure(){		//생성자
		System.out.println("어라?");
	}
	
	public Constructure(int num){		//생성자
		System.out.println("어라? int num?");
	}
	
	public static void main(String[] args) {
		Constructure c = new Constructure();
		Scanner scan = new Scanner(System.in); //Scanner는 기본 생성자가 없기 때문에 System.in을 넣어줘야한다.
	}
}
