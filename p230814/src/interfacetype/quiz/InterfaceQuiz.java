package interfacetype.quiz;

/*
 * [과제] Vehicle type을 interface로 변경
 */
interface Vehicle {
	public abstract void take();
}

class Car implements Vehicle {
	int num;
	
	// constructor
	public Car(int num) {
		this.num = num;
	}

	// method
	@Override
	public void take() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}

}

class Yacht implements Vehicle {
	int num;
	// constructor
	public Yacht(int num) {
		this.num = num;
	}

	// method
	@Override
	public void take() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}

}

public class InterfaceQuiz {
	public static void main(String[] args) {

		Vehicle[] vehicles = { new Car(3030), new Yacht(3929303) };

		info(vehicles[0]);
		info(vehicles[1]);
	}

	public static void info(Vehicle vehicle) {
		vehicle.take();
	}
}
