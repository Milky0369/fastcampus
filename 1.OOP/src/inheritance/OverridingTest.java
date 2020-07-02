package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(10010, "이순신");
		cust1.bonusPoint = 1000;

		VIPCustomer cust2 = new VIPCustomer(10020, "김유신");
		cust2.bonusPoint = 10000;
		
		int price1 = cust1.calcPrice(10000);
		int price2 = cust2.calcPrice(10000);
		
		System.out.println(cust1.showCustomerInfo() + " 지불금액은 " + price1 + "원 입니다.");
		System.out.println(cust2.showCustomerInfo() + " 지불금액은 " + price2 + "원 입니다.");

		Customer cust3 = new VIPCustomer(10030, "나몰라");
		cust3.bonusPoint = 10000;
		
		System.out.println(cust2.showCustomerInfo() + " 지불금액은 " + cust3.calcPrice(10000) + "원 입니다.");
	}
	
}
