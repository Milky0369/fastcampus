package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

//	@Override
//	public void order() {
//		Buy.super.order(); // order 메서드가 겹치니 Buy껄 쓰겠다.
//	}

	// 두개 다 있으니까 그냥 재정의 한다.
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void sayHello() {
		System.out.println("customer Hello");
	}
	
}
