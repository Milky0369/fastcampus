package array;

public class ObjectCopy {

	public static void main(String[] args) {
	
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		library[0].setTitle("나목");
		library[0].setAuth("박완서");

		// 참조된 인스턴스를 바꾼다면 복사된 배열도 바뀐다.
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
	}
	
}