/*
다형성으로 구현된 객체 배열(p3)의 메서드를 호출하시오.
Son 객체는 play() 메서드를,
Daughter 객체 study()메서드를 호출하시오.
향상된 for문(enhanced for loop)으로 구현하시오.
*/

class Parent {

}

class Son extends Parent {
	//method
		public void play() {
			System.out.println("[Son] 신나게 놀고 있어요~");
		}

}

class Daughter extends Parent {
	//method
		public void study() {
			System.out.println("[Daughter] 학원에서 공부하고 있어요~");
		}

}

public class Ex01_2 {

	public static void main(String[] args) {
		Parent[] p3 = new Parent[2];
		p3[0] = new Son();
		p3[1] = new Daughter();

		// downcasting 사용
		for (Parent p : p3) {
			if (p instanceof Son)
				((Son) p).play();
			if (p instanceof Daughter)
				((Daughter) p).study();
		}

	}

}
