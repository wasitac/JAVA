package polymorphism.quiz;

abstract class Fruit {
	// field
	protected String name;
	protected int count;

	// constructor
	public Fruit() {
	}

	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}

	// abstract method
	abstract void showInfo();

}

class Banana extends Fruit {
	// constructor
	public Banana(String name, int count) {
		super(name, count);
	}

	// method
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다.";
	}

	@Override
	public void showInfo() {
		System.out.println("=====================");
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("개수는 " + super.count + "개 있습니다.");
		System.out.println("=====================");
		System.out.println();
	}

}

class Apple extends Fruit {
	// constructor
	public Apple(String name, int count) {
		super(name, count);
	}

	// method
	@Override
	public String toString() {
		return "[Apple] 나는 사과다.";
	}

	@Override
	public void showInfo() {
		System.out.println("=====================");
		System.out.println(">>> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">>> 수량은 " + super.count + "개 입니다.");
		System.out.println("=====================");
		System.out.println();
	}

}

class Mango extends Fruit {
	// method
	@Override
	public String toString() {
		return "[Mango] 망고는 멸종 위기가 아니다.";
	}

	@Override
	void showInfo() {
		System.out.println("망고는 노란색이 아닐 수도 있습니다.");
		System.out.println();
	}
}

public class Ex04 {
	/*
	 * [문제] main method는 코드 그대로. fruitInfo method의 instanceof 연산자 사용하지 않고, 과일의 정보가
	 * 출력되도록 코드를 수정하시오.
	 */
	public static void main(String[] args) {
		fruitInfo(new Banana("레드 바나나", 10));
		fruitInfo(new Apple("홍옥", 5));
		fruitInfo(new Mango());
	}

	public static void fruitInfo(Fruit fruit) {
		System.out.println(fruit);
		fruit.showInfo();
	}
}
