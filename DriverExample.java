package ch07;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(vehicle);
		driver.drive(bus); //자동 타입변환 : Vehicle vehicle = bus;
		driver.drive(taxi); //자동 타입변환 : Vehicle vehicle = taxi;
	}

}
