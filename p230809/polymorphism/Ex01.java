package polymorphism;

class Parent {
	private int money = 1_000_000;
	
	public void spend(int money) {
		this.money -= money;
		System.out.println("[Parent] 남은 돈은 " + this.money + "입니다.");
	}
	
	private void working() {
		System.out.println("부모님은 열심히 일하는 중입니다.");
	}	
}

class Son extends Parent {
	public void play() {
		System.out.println("신나게 놀고 있어요~");
	}
	
	@Override
	public void spend(int money) {
	System.out.println("[Son] 용돈 " + money + "원 주세요~");
	}	

}

class Daughter extends Parent {
	public void study() {
		System.out.println("학원에서 공부하고 있어요~");
	}
	@Override
	public void spend(int money) {
		System.out.println("[Daughter] 학원비 " + money + "원 주세요~");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Parent s = new Son();
		s.spend(200000);
		s.play();
		System.out.println();
		
		Daughter d = new Daughter();
		d.spend(300000);
		
		Parent p = new Parent();
		p.spend(100000);
		System.out.println(s);
	}

}

/*
 * [다형성]
 * 참조변수의 타입과 생성 객체의 타입을 다르게 할 수 있다.
 * 부모 타입의 참조변수로 자식 타입의 객체를 가리킨다.
 * 부모의 멤버만 접근 가능 -> 자식의 멤버는 접근 불가능
 * 단, 오버라이딩된 자식의 멤버 메서드는 접근 가능
 * 
 * << 문법 >>
 * 부모자료형 참조변수 = new 자식자료형();
 */