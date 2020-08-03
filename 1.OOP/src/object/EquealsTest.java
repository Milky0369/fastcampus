package object;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Student ) {
			
			Student std = (Student) obj;
			
//			return (this.studentNum == std.studentNum);
			
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
			
		}
		
		return false;
	}
	
}

public class EquealsTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 메모리 주소값이 같은지 여부에 대한 체크
		System.out.println(str1.equals(str2)); // 문자열이 같은지에 대한 체크
		
		Student Lee = new Student(1, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(2, "이순신");
		
		System.out.println(Lee == Lee2);
		System.out.println(Lee == Shin);
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}
	
}
