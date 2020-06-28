package array;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student2 lee = new Student2(1, "Lee");
		Student2 kim = new Student2(2, "Kim");
		Student2 cho = new Student2(3, "Cho");
		
		lee.addBook("태백산맥1");
		lee.addBook("태백산맥2");
		
		kim.addBook("토지1");
		kim.addBook("토지2");
		kim.addBook("토지3");
		
		cho.addBook("해리포터1");
		cho.addBook("해리포터2");
		cho.addBook("해리포터3");
		cho.addBook("해리포터4");
		cho.addBook("해리포터5");
		cho.addBook("해리포터6");
		
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		cho.showStudentInfo();
		
	}
	
}
