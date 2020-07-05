package polymorphism;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentId;
	
//	public VIPCustomer() {
//		
//		super(0, null);
//		
//		custGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		int payPrice = price - (int)(price * salesRatio);
		
		System.out.println(custName + "님의 지불 금액은 " + salesRatio * 100 + "% 할인율이 적용되어 " + payPrice + "원 입니다.");
		System.out.println(super.showCustomerInfo());
		
		return payPrice;
	}
	
	public VIPCustomer(int custId, String custName) {
		super(custId, custName);
		
		custGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.2;
		
//		System.out.println("VIPCustomer() 생성자 호출");
	}
	
}
