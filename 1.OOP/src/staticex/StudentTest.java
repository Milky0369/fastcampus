package staticex;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentTest = new Student("TEST");
		Student studentYang = new Student(1, "양세완"); // 기본 생성자
		
		System.out.println(studentYang.getSerialNum());
		System.out.println(studentTest.getSerialNum());
		
		System.out.println(studentYang.getStudentName());
		System.out.println(studentTest.getStudentName());
		
		System.out.println(studentTest.getStudentId());
		System.out.println(studentYang.getStudentId());
		
		
	}

}
