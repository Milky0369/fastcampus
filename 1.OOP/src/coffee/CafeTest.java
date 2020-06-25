package coffee;

public class CafeTest {

	public static void main(String[] args) {
		
		Person Kim = new Person("Kim", "americano", 4000);
		Person Lee = new Person("Lee", "latte", 5000);
		
		Kim.takeStarCafe();
		Lee.takeKongCafe();
		
	}
	
}
