package polymorphism.quiz;

class Fruit {
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
	
}

class Banana extends Fruit {
	// constructor
	public Banana(String name, int count) {
		super(name, count);
	}

	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다.";
	}
	
	public void nameAndCount() {
		System.out.println("=====================");
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("개수는 " + super.count + "개 있습니다.");
		System.out.println("=====================");
	}	
	
}

class Apple extends Fruit {

	public Apple(String name, int count) {
		super(name, count);
	}

	@Override
	public String toString() {
		return "[Apple] 나는 사과다.";
	}
	
	public void showInfo() {
		System.out.println("=====================");
		System.out.println(">>> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">>> 수량은 " + super.count + "개 입니다.");
		System.out.println("=====================");
	}	
	
}

class Mango extends Fruit {
	//
}

public class Ex04 {

	public static void main(String[] args) {
//		Banana banana = new Banana("레드 바나나", 10);
//		System.out.println(banana);
//		banana.nameAndCount();
//
//		Apple apple = new Apple("홍옥", 5);
//		System.out.println(apple);
//		apple.showInfo();
		
		fruitInfo(new Banana("레드 바나나", 10));
		fruitInfo(new Apple("홍옥", 5));
		fruitInfo(new Mango());
	}
	
	public static void fruitInfo(Fruit fruit) {
		System.out.println(fruit);
		
		if(fruit instanceof Banana)
			((Banana)fruit).nameAndCount();
		else if(fruit instanceof Apple)
			((Apple)fruit).showInfo();
	}
}
