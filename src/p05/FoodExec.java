package p05;

public class FoodExec {
	
	public static void printFood(Food[] foods) {
		
		for(Food f : foods) {
			if(f == null) continue;
			System.out.println("음식 : " + f.name);
			System.out.println("가격 : " + f.price);
			System.out.println("타입 : " + f.type + "\n");
		}

	}
	
	public static void main(String[] args) {
		
		Food f = new Food();
		System.out.println(f.name);
		f.name = "삼겹살";
		f.price = 15000;
		f.type = "한식";
		
		Food[] foods = new Food[5];
		foods[0] = f;
		
		printFood(foods);
		
	}
}