package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(10010, "이순신");
		
//		cust1.setCustName("이순신");
//		cust1.setCustId(10010);
		cust1.bonusPoint = 1000;
		
		System.out.println(cust1.showCustomerInfo());
		
		VIPCustomer cust2 = new VIPCustomer(10020, "김유신");
		
//		cust2.setCustName("김유신");
//		cust2.setCustId(10020);
		cust2.bonusPoint = 10000;
		
		System.out.println(cust2.showCustomerInfo());
		
		// 하위 클래스 타입은 상위 클래스 타입으로 묵시적 형변환이 가능하다.(업캐스팅)
		cust1 = cust2;
		
		System.out.println(cust1.showCustomerInfo());
	}
	
}
