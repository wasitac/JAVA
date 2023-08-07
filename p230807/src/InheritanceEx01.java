class GrandParent {
}

class Parent {
	// instance field
	int money = 1_000_000;

	// constructor
	Parent() {
		System.out.println("[Parent] 생성자 실행됨!");
	}

	Parent(int money) {
		System.out.println("[Parent] 매개변수가 1개인 생성자 실행됨!");
		this.money = money;
	}

	// instance method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
}

// 다중 상속 : 부모가 2개 이상 => Java는 다중 상속을 허용하지 않음
// 단일 상속 : 부모가 1개 => Java는 단일 상속만 허용
class Child extends Parent {
	Child() {
		System.out.println("[Child] 생성자 실행됨!");
	}

	Child(int money) {
		// 부모의 생성자로 접근 //부모의 멤버변수에 접근
//		super(money)
		super.money = money;
		System.out.println("[Child] 매개변수가 1개인 생성자 실행됨!");
	}

	/*
	 * [method overriding] - 상속 관계에서 자식(sub) class가 부모(super) class의 멤버 메서드를 재정의 -
	 * 부모 class의 멤버 메서드에서 선언부 그대로, 바디(기능)만 수정 - 선언부 그래도 : 반환형, 메소드명, 매개변수 정보가 같아야 함
	 */
	void buy(int money) {
		System.out.println("용돈 " + money + "원 주세요~");
	}

	/*
	 * [method overloading] -
	 */
	void buy() {
		System.out.println("용돈 주세요~ 용돈 주세요~");
	}
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		// [객체 생성 순서]
		// 메모리 할당 : 부모-> 자식
		// 생성자 실행 : 부모 ->자식
		System.out.println("\n1. Child 객체 생성 : new Child() ========");
		Child c = new Child();
		c.buy(100_000);

		System.out.println("\n2. Child 객체 생성 : new Child(500_000) ========");
		Child c2 = new Child(500_000);
		c2.buy(10_000);

	}

}
