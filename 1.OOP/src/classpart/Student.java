package classpart;

// public 키워드 클래스는 작업 파일마다 1개가 유일해야 한다.
public class Student {
	// class는 객체를 코드화 한 것.
	// class는 멤버변수와 메서드로 구성 할 수 있다.
	
	int studentId;
	String studentName;
	String address;
	
	
	public void showStudentInfo() { // 매개변수 영역
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentPark = new Student();
		studentPark.studentName = "박은종";
		studentPark.showStudentInfo();
	}
	
}
