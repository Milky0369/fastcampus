package inheritance;

public class Customer {
	
	protected int custId;
	protected String custName;
	protected String custGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() {
		custGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return custName + "님의 등급은 " + custGrade + "이며 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
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
