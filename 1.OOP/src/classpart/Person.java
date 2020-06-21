package classpart;

public class Person {
	int age;
	String name;
	boolean marry;
	int child;
	
	public void PersonInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("결혼여부 : " + marry);
		System.out.println("자녀 수 : " + child);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.age = 40;
		person.name = "James";
		person.marry = true;
		person.child = 3;
		
		person.PersonInfo();
	}
}
