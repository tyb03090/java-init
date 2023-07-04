package p06;

public class HumanExec {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		Human h4 = new Human();
		Human h5 = new Human();
		
		h1 = new Human();
		h1.name = "김용준";
		h1.age = 25;
		
		h2 = new Human();
		h2.name = "김용수";
		h2.age = 26;
		
		h3 = new Human();
		h3.name = "이진수";
		h3.age = 31;
		
		h4 = new Human();
		h4.name = "박정수";
		h4.age = 43;
		
		h5 = new Human();
		h5.name = "한샘";
		h5.age = 24;
		
		Human[] humans = new Human[5];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		
		Human top = humans[0];
		Human bottom = humans[0];
		
		String names = "";
		int sum = 0;
		
		for(int i = 0; i < humans.length; i++) {
		
			Human human = humans[i];
			
			if(top.age < human.age) {
				top = human;
			}
			if(bottom.age > humans[i].age) {
				bottom = human;
			}
		}
		
		System.out.println("최고령 " + top.name + "의 나이는" + top.age + "입니다.");
		System.out.println("최연소 " + bottom.name + "의 나이는" + bottom.age + "입니다.");
		
		for(int i = 0; i < humans.length; i++) {
			sum += humans[i].age;
		}
		int avg = sum / humans.length;
		
		for(int i = 1; i < humans.length; i++) {
			int abs = Math.abs(humans[i].age - avg);
			if(bottom.age > abs) {
				bottom.age = abs;
				names = humans[i].name + "님";
			}
		}
		
		names = names.substring(0, names.length());
		
		System.out.println("평균 나이에 가장 근접한 사람은 " + names + " 입니다.");
		
	}
}
