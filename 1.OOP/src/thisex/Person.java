package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
		// 생성자는 인스턴스 값을 초기화 하는 역활을 한다.
		// this로 다른 생성자를 호출 할때 그 위에 다른 인스턴스를 바꾸는 일은 허용되지 않는다.
		this("이름없음", 1);
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() {
		return this;
	}
	
}
