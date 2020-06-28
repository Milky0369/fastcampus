package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1, "Lee");
		Student kim = new Student(1, "Kim");
		
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 90);
		
		kim.addSubject("국어", 100);
		kim.addSubject("수학", 90);
		kim.addSubject("영어", 80);
		
		lee.showStudentInfo();
		System.out.println("===================================");
		kim.showStudentInfo();
		
	}
	
}
