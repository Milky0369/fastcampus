package classpart;

public class Order {
	
	long orderNum;
	String orderId;
	String orderDate;
	String orderName;
	String orderProduct;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + orderId);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + orderName);
		System.out.println("주문 상품 번호 : " + orderProduct);
		System.out.println("배송 주소 : " + address);
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 201907210001L;
		order.orderId = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.orderName = "홍길순";
		order.orderProduct = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
	}
}
