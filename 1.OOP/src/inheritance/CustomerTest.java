package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.setCustName("이순신");
		cust1.setCustId(10010);
		cust1.bonusPoint = 1000;
		
		System.out.println(cust1.showCustomerInfo());
		
		VIPCustomer cust2 = new VIPCustomer();
		
		cust2.setCustName("김유신");
		cust2.setCustId(10020);
		cust2.bonusPoint = 10000;
		
		System.out.println(cust2.showCustomerInfo());
	}
	
}
