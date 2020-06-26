package staticex;

public class Company {
	// 싱글톤을 사용하는 이유
	// 여러번 new 되었을때 문제가 발생할 여지가 있으면 사용

	// 해당 클래스의 유일한 인스턴스
	private static Company instance = new Company();
	
	// 생성자는 private로 설정해야 한다. -> 외부에서 호출을 통해 객체를 새로 생성 할 수 없도록 지정 -> 인스턴스를 생성한 후 공유한다.
	private Company () {}
	
	// 외부에서 인스턴스 생성과 상관없이 메서드를 호출 할 수 있도록 static을 붙여준다.
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
