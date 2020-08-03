package object;

class Book implements Cloneable {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable { // 인스턴스가 GC에서 해제될때 호출되는 메서드이다.
		super.finalize();
	}
	
}

public class ToStringTest {

	public static void main(String[] args) {
		
		Book book = new Book("토지", "박경리");
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str);
		
		try {
			Book book2 = (Book)book.clone();
			System.out.println(book2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}  
	
}
