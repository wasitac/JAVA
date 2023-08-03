/*
 * [문제] Car class 정의
 */
class Car {
	int door;
	String color;
	
	Car(){
		this(4, "black");
	}
	Car(int door) {
		this(door, "black");
	}

	Car(String color) {
		this(4, color);
	}
	
	Car(int door, String color){
		this.door = door;
		this.color = color;
	}

	public void info() {
		System.out.printf("문 개수 : %d, 색 : %s\n", door, color);
	}
}

public class ConstructorQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.info(); //문 개수 4, 색 black

		Car c2 = new Car(2);
		c2.info(); //문 개수 2, 색 black

		Car c3 = new Car("white");
		c3.info(); // 문 개수 4, white

		Car c4 = new Car(6, "gray");
		c4.info(); //문 개수 6, 색 gray
	}

}
