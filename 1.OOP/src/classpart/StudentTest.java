package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		
		// 기본 생성자를 이용한 객체 생성
		Student studentKim = new Student();
		
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.showStudentInfo();
		
		Student studentTest = new Student("TEST");
		
		studentTest.showStudentInfo();
		
		// 생성자를 이용한 객체 생성
		Student studentYang = new Student(1, "양세완"); // 기본 생성자
		
		studentYang.address = "서울";
		studentYang.showStudentInfo();
		
		System.out.println(studentYang); // Heap Memory상 address값을 16진수로 표현한다. 참조값 출력
		System.out.println(studentKim);
		
	}

}
