package polymorphism;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int custId, String custName) {
		super(custId, custName);
		
		custGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
