package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
//		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}

	// java9 부터 지원 - 인터페이스 내에서 사용하기 위한 메서드
//	private void myMethod() {
//		System.out.println("private method");
//	}
	
}
