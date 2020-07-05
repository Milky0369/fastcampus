package polymorphism;

public class GoldCustomer extends Customer {

	double salesRatio;
	
//	public GoldCustomer(int custId, String custName) {
//		super(custId, custName);
//		
//		custGrade = "GOLD";
//		bonusRatio = 0.02;
//		salesRatio = 0.1;
//	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		int payPrice = price - (int)(price * salesRatio);
		
		System.out.println(custName + "님의 지불 금액은 " + salesRatio * 100 + "% 할인율이 적용되어 " + payPrice + "원 입니다.");
		System.out.println(super.showCustomerInfo());
		
		return payPrice;
	}
	
	public GoldCustomer(int custId, String custName) {
		super(custId, custName);
		
		custGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		
//		System.out.println("GOLDCustomer() 생성자 호출");
	}
	
}
