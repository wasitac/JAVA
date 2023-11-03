package inner;

class Super {
	public Super(){
		System.out.println("[Super] 생성자 실행됨");
	}
	public void hey() {
		System.out.println("[Super] hey() 실행됨");
	}
}

class Sub extends Super {
	public Sub() {
		System.out.println("[Sub class] 생성자 실행됨");
	}
	
	// instance method
	public void show() {
		System.out.println("[Sub class] show() 실행됨");
	}
}
public class Ex06 {

	public static void main(String[] args) {
//		Sub s = new Sub();
//		
//		// 1. 다형성
//		Super s2 = new Sub();
//		s2.hey();
		
		// 2. [익명 클래스] 클래스 확장
		Super anonymous = new Super() {
			@Override
			public void hey() {
				System.out.println("오버라이딩된 hey()");
			}
			// instance method
//			public void say() {
//				System.out.println("정의된 say() 메서드");
//			}
		};
		anonymous.hey();
//		anonymous.say();
		
		Sub anonymosSub = new Sub() {
			@Override
			public void show() {
				System.out.println("오버라이딩된 show()");
			}
		};
		anonymosSub.show();
		
		Sub sub = new Sub();
		sub.show();
	}

}
