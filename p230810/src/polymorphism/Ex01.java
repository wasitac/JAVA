/*
다형성으로 구현된 객체 배열(p3)의 메서드를 호출하시오.
Son 객체는 play() 메서드를,
Daughter 객체 study()메서드를 호출하시오.
향상된 for문(enhanced for loop)으로 구현하시오.
*/
package polymorphism;

class Parent {
	//field
	private int money = 1000000;

	//method
	public void spend(int money) {
		this.money -= money;
		System.out.println("[Parent] 남은 돈은 " + this.money + "입니다.");
	}

	public void working() {
		System.out.println("[Parent] >> 부모님은 열심히 일하는 중입니다.");
	}

}

class Son extends Parent {
	//method
	public void play() {
		System.out.println("[Son] 신나게 놀고 있어요~");
	}

	@Override
	public void spend(int money) {
		System.out.println("[Son] 용돈 " + money + "원 주세요~");
	}
}
class GSon extends Son {
	//method

}

class Daughter extends Parent {
	//method
	public void study() {
		System.out.println("[Daughter] 학원에서 공부하고 있어요~");
	}

	@Override
	public void spend(int money) {
		System.out.println("[Daughter] 학원비 " + money + "원 주세요~");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Son s = new Son();
		s.spend(200000);
		
		Daughter d = new Daughter();
		d.spend(300000);
		
		Parent p1 = new Son();
		p1.spend(10000);
		
		/*
		 * [다형성]
		 * 부모 type의 참조변수로 자식 type의 객체 가리킴(접근)
		 * 부모의 멤버만 접근 가능 -> 자식의 멤버에 접근 불가능
		 * 단, 오버라이딩된 자식의 멤버 메서드만 접근 가능
		 * 
		 * <<문법>>
		 * 부모의 자료형 참조변수 = new 자식자료형();
		 */
		
//		Parent p2 = new Son();
//		p2.spend(1000);
//		p2.working();
		
		System.out.println("<< 다형성 : 객체 배열 >>");
		Parent[] p3 = new Parent[2];
		p3[0] = new Son();
		p3[1] = new Daughter();
		
		p3[0].spend(200);
		p3[1].spend(300);
		
		System.out.println("-----------------------");
		p3[0].spend(100);
		for (Parent p : p3) {
			if (p instanceof Son)
				((Son) p).play();
			//접근연산자가 형변환 연산자보다 우선순위가 높기 때문에 소괄호를 사용해 형변환을 먼저 수행해야한다
			else if (p instanceof Daughter)
				((Daughter) p).study();
		}
		System.out.println("-----------------------");
		
//		Son s1 = (Son)new Parent();
//		s1.play();
		// 부모 type -> 자식 type (downcanting, 강제/명시적 형변환)
		Son s2 = (Son)p1;
		s2.play();
		s2.spend(300);
		
		//자식 type -> 부모 type (upcasting, 자동/묵시적 형변환)
		Parent p4 = s2;
		p4.spend(350);
		p4.working();
		
		//형변환 가능 여부
		// 인스턴스 instanceof 클래스
		System.out.println(s2 instanceof Parent);
		System.out.println(s instanceof Son);
//		System.out.println(s instanceof Daughter);
		System.out.println(s instanceof Object);
		
	}

}
