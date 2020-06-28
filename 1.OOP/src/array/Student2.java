package array;

import java.util.ArrayList;

public class Student2 {

	private int studentId;
	private String studentName;
	private ArrayList<Book> bookList;
	
	public Student2(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		Book book = new Book();
		
		book.setTitle(title);
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {

		System.out.print(studentName + " 학생이 읽은 책은 : ");
				
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		
		System.out.println("입니다.");

	}
	
}
