package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subway2 = new Subway(2);
		Subway subway4 = new Subway(4);
		
		Taxi taxi = new Taxi();
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subway2);
		studentE.takeTaxi(taxi);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subway2.showSubwayInfo();
		subway4.showSubwayInfo();
		
		taxi.showSTaxiInfo();
	}
	
}
