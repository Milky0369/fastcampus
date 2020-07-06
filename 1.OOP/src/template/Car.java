package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void startCar();
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("세차를 합니다.");
	}

	// 재정의 되서는 안되는 메서드 final 키워드를 붙인다.
	final public void run() {
		startCar();
		drive();
		stop();
		washCar();
		turnOff();
	}
	
}