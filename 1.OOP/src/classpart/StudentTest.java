package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentYang = new Student();
		studentYang.studentName = "양세완";
		studentYang.address = "서울";
		
		studentYang.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentYang); // Heap Memory상 address값을 16진수로 표현한다. 참조값 출력
		System.out.println(studentKim);
	}

}
