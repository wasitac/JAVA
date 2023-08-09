class Parent {
	int money = 1000000;

	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈 " + this.money + "원 입니다.");

	}
}

class Child extends Parent{
	void study() {
		System.out.println("저는 공부중 입니다.");
	}
	
	//overriding
	void buy(int money) {
		System.out.println(" << overriding method >>");
		System.out.println("부모님 용돈 " + money + "원 주세요~");
	}
	
	void buy() {
		System.out.println("<< overloading method >>");
		System.out.println("용돈 주세요");
	}
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		Child child = new Child();
		child.study();
		child.buy(200000);
		child.buy();
		
	}

}
