package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer cust1 = new VIPCustomer(1, "양일완");
		Customer cust2 = new GoldCustomer(2, "양이완");
		Customer cust3 = new GoldCustomer(3, "양삼완");   
		Customer cust4 = new Customer(4, "양사완");
		Customer cust5 = new Customer(5, "양오완"); 
										
		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		customerList.add(cust5);
		
		for(Customer cust : customerList) {
			System.out.println(cust.showCustomerInfo());
		}
		
		System.out.println("================================================");
		
		int price = 10000;
		
		for(Customer cust : customerList) {
			cust.calcPrice(price);
		}
	}
	
}
