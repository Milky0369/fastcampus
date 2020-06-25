package coffee;

public class Person {

	String name;
	String order;
	int cash;
	int price;
	
	StarCafe star = new StarCafe();
	KongCafe kong = new KongCafe();
	
	public Person(String name, String order, int cash) {
		this.name = name;
		this.order = order;
		this.cash = cash;
	}
	
	public void takeStarCafe() {
		
		if("americano".contentEquals(order)) {
			price = star.takeAmericano();
			
			cash -= price;
		} else {
			price = star.takeLatte();
			
			cash -= price;
		}
		
		if(cash > 0) {
			System.out.println(name + "님이 " + price + "로 별다방 " + order + "를 구입하여 잔액 " + cash + "원이 남았습니다.");
		} else {
			System.out.println("돈이 부족합니다.");
		}
		
		
	}
	
	public void takeKongCafe() {
		
		if("americano".contentEquals(order)) {
			price = kong.takeAmericano();
			
			cash -= price;
			
			System.out.println();
		} else {
			price = kong.takeLatte();
			
			cash -= price;
			
			System.out.println();
		}
		
		if(cash > 0) {
			System.out.println(name + "님이 " + price + "로 별다방 " + order + "를 구입하여 잔액 " + cash + "원이 남았습니다.");
		} else {
			System.out.println("돈이 부족합니다.");
		}
		
		
	}
	
}
