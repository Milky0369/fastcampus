package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("태백산맥 1");
		bookQueue.enQueue("태백산맥 2");
		bookQueue.enQueue("태백산맥 3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
	}
	
}
