package inheritance;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentId;
	
	public VIPCustomer() {
		custGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
}
