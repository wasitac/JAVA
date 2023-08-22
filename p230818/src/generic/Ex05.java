package generic;

class Thing {
	String id;
	String name;

	public Thing() {
	}

	public Thing(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 TV이다!";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen이다!";
	}
}

class Box<T> {
	T item;
	public void store(T item) {
		System.out.println("[박스에 상품을 담는다.]");
		this.item = item;
	}
	
	public T out() {
		System.out.println("[박스에서 상품을 꺼내다.]");
		return item;
	}
}
public class Ex05 {
	/*
	 * Box 제네릭클래스에 제약을 두지 않고 와일드 카드를 사용하면 
	 * box에 유효한 값이 들어왔는지 컴파일 과정에서 검사할 수 없다. 
	 * box를 Thing 타입의 참조변수에 대입해서 box에 Thing타입(혹은 Thing의 자식 타입)
	 * 이 아닌 데이터가 들어오는지 검사해 컴파일 자료형에 안전한 코드로 만든것 같다.
	 * extends 혹은 Thing thing 둘중에 하나만 사용해도 컴파일 과정에서 걸러지긴하겠지
	 */ 
	public static void openBox(Box<? extends Thing> box) {
		Thing thing = box.out();
		System.out.println(thing);
	}
	
	public static void main(String[] args) {
		//제네릭타입 사이에 다형성같은건 없다.
//		Box<Thing> tv = new Box<Tv>();
		Box<Tv> one = new Box<Tv>();
		Box<? extends Thing> b1 = new Box<Tv>();
		Box<? extends Thing> b2 = new Box<Pen>();
		Box<Thing> box2 = new Box<Thing>();
		Box<Pen> box3 = new Box<Pen>();
		Box<Tv> box4 = new Box<Tv>();
		Box<String> box5 = new Box<String>();
		one.store(new Tv());
		openBox(one);
//		openBox(box5);
		
//		openBox(new Box<String>());
		
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
	}
}
