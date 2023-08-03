class Fruit {
	// constructor
	// 매개변수가 없는 생성자
	Fruit() {
		System.out.println("매개변수가 없는 생성자 실행");
	}

	// 매개변수가 1개인 생성자
	Fruit(int count) {
		System.out.println("====================");
		System.out.println("매개변수가 1개인 생성자 실행");
		System.out.println("count >> " + count);
	}

	Fruit(double count) {
		System.out.println("====================");
		System.out.println("매개변수가 1개인 생성자 실행");
		System.out.println("[실수] count >> " + count);
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		Fruit fruit = new Fruit(); // 매개변수가 없는 생성자 호출
		Fruit fruit2 = new Fruit(5); // 매개변수가 1개인 생성자 호출
		Fruit fruit3 = new Fruit(100);
		Fruit fruit4 = new Fruit(4.33);
	}

}
