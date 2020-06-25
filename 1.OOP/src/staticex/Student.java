package staticex;

public class Student {
	
	private static int serialNum = 1000;
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	int studentId;
	String studentName;
	String address;
	
	public Student() {}
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		
		studentId = serialNum;
	}
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		
		studentId = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	// 인스턴스는 static 메서드에서 사용할 수 없다.
	public String getStudentName() {
		
		int i = 0;
		studentName = "Lee";
		
		return studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
}
