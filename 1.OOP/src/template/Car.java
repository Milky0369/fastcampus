package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}

	// 재정의 되서는 안되는 메서드 final 키워드를 붙인다.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}