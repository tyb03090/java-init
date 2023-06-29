package p04;

public class Cafe {

	public static String getCoffee(String order, int price) {
		int coffeePrice = 5000;
		int charge = price - coffeePrice;
		if(coffeePrice > price) {
			return (coffeePrice - price) + "원이 부족합니다.";
		}else if(price > coffeePrice) {
			return "여기 " + charge + "원이 남았습니다.";
		}
		return "주문하신 " + price + "원 짜리 " + order + "가 준비되었습니다.";
	}
	
	public static void main(String[] args) {
	
		String coffee = getCoffee("아아", 10000);
		System.out.println(coffee);
	}
}
