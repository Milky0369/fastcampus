package polymorphism;

public class Customer {
	
	protected int custId;
	protected String custName;
	protected String custGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
//	public Customer() {
//		custGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(int custId, String custName) {
		this.custId = custId;
		this.custName = custName;
		
		custGrade = "SILVER";
		bonusRatio = 0.01;
		
//		System.out.println("Customer() 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		System.out.println(custName + "님의 지불 금액은 " + price + "원 입니다.");
		System.out.println(this.showCustomerInfo());
		
		return price;
	}
	
	public String showCustomerInfo() {
		return custName + "님의 등급은 " + custGrade + "이며 적립된 보너스 포인트는 " + bonusRatio * 100 + "% 적립되어 " + bonusPoint + "점 입니다.";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
}
