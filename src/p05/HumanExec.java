package p05;

public class HumanExec {

	public static void main(String[] args) {
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[0].name = "김용준";
		humans[0].money = 300000;
		
		humans[1] = new Human();
		humans[1].name = "이명관";
		humans[1].money = 150000;
		
		humans[2] = new Human();
		humans[2].name = "김용빈";
		humans[2].money = 255000;
		
		humans[3] = new Human();
		humans[3].name = "김철수";
		humans[3].money = 350000;

		humans[4] = new Human();
		humans[4].name = "김진수";
		humans[4].money = 300001;
		
		
		int moneySum = 0;
		
		for(int i = 0; i < humans.length; i++) {
			moneySum += humans[i].money;
		}
		System.out.println(moneySum);
		
		int moneyAvg = moneySum/humans.length;
		System.out.println(moneyAvg);
		
		String names = "";
		for(int i = 0; i < humans.length; i++) {
			if(moneyAvg <= humans[i].money) {
				names += humans[i].name + "님, ";
			}
		}
		
		names = names.substring(0, names.length() - 2);
		System.out.println(names + "은 평균 이상입니다.");
	}
}
