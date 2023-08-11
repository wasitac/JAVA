package abstractclass;

/*
 * [추상 클래스] abstract class
 *  - 추상 클래스 내 abstract method가 있을 수도 있고, 없을 수도 있음.
 *  - 추상 클래스는 인스턴스 생성 불가능
 *  - 다형성 또는 상속 사용
 *  
 * [추상 메서드] abstract method
 *  - body가 없는 메서드 --> 미완성 메서드
 *  - 반드시 abstract class 내 존재
 *  - abstract method가 있는 abstract class를 상속 받은 자식 클래스는 
 *  반드시 abstract method를 overriding해야 함 --> 강제성!! 
 *  - 오버라이딩된 자식의 메서드는 부모의 추상 메서드의 접근 권한보다 같거나 커야한다.
 */
abstract class Parent {
	// field
	int num;
	static int var;

	// method
	abstract void methodOne();
	
	//abstract method : static 불가능
//	public static abstract void methodThree();
	
	public void methodTwo() {
		System.out.println("methodTwo 실행됨!");
	}
	
	public static void methodFour() {
		System.out.println("methodFour");
	}
}

class Child extends Parent {

	@Override
	public void methodOne() {
		System.out.println("오버라이딩된 추상 메서드");
	}
	
	public void show() {
		System.out.println("shos");
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 추상 클래스로 인스턴스 생성 불가능
//		 Parent p = new Parent();

		// 2. 자식 클래스로 인스턴스 생성 가능
		Child c = new Child();
		c.methodOne();

		// 3. 다형성
		Parent p = new Child();
		p.methodOne();
		//p.show();  //error

	}
}
