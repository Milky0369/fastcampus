package inheritance;

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
	
	public VIPCustomer(int custId, String custName) {
		super(custId, custName);
		
		custGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
}
