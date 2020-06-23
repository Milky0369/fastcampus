package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1, "Mr.Lee");
		studentLee.setKoreaSubject("국어", 75);
		studentLee.setMathSubject("수학", 97);
		
		studentLee.showStudentSocre();
		
		Student studentKim = new Student(2, "Dr.Kim");
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMathSubject("수학", 95);		
		
		studentKim.showStudentSocre();
	}

}
