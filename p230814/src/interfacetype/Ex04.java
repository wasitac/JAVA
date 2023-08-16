package interfacetype;
abstract class Vehicle {
	// field
	int num;

	// constructor
	public Vehicle() {
	}

	// method
	public Vehicle(int num) {
		this.num = num;
	}

	public abstract void take();
}

class Car extends Vehicle {
//	int carNumber;
//
//	public Car(int carNumber) {
//		this.carNumber = carNumber;
//	}
//
//	public void drive() {
//		System.out.println("자동차가 고속도로를 달립니다.\n");
//	}

	// constructor
	public Car(int num) {
		super(num);
	}

	// method
	@Override
	public void take() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}

}

class Yacht extends Vehicle {
//	int yachtNumber;
//
//	public Yacht(int yachtNumber) {
//		this.yachtNumber = yachtNumber;
//	}
//
//	public void sail() {
//		System.out.println("요트가 한강 위를 떠다닙니다.\n");
//	}

	// constructor
	public Yacht(int num) {
		super(num);
	}

	// method
	@Override
	public void take() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}

}

public class Ex04 {
	public static void main(String[] args) {
//		Car car = new Car(3030);
//		Yacht yacht = new Yacht(9809809);
//		car.drive();
//		yacht.sail();

		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car(3030);
		vehicles[1] = new Yacht(3929303);

		info(vehicles[0]);
		info(vehicles[1]);
	}

	public static void info(Vehicle vehicle) {
		vehicle.take();
	}
}
