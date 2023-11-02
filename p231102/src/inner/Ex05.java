package inner;

class OuterFive {
	
	public void show() {
		// method 내 정의된 class
		class InnerFive {
			// instance field
			int num = 7;
			
			// static field
			static int user;
			
			// constructor
			public InnerFive() {
				System.out.println("[InnerFive] 생성자 실행됨");
			}
			// instance method
			public void showNum() {
				System.out.println("[showNum] 메소드 실행됨");
			}
		}
		InnerFive in = new InnerFive();
		in.showNum();
		InnerFive.user = 100;
		System.out.println("user >> " + InnerFive.user);
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		OuterFive out = new OuterFive();
		out.show();
	}

}
