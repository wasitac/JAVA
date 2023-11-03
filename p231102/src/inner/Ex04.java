package inner;

class OuterFour {

//	InnerFour in = new InnerFour();
	
	public void show() {
		// local variable
		int num;
		
		// error! class 정의 전에 객체 생성
		// InnerFour in = new InnerFour();
		
		// local inner class
		class InnerFour {
			public InnerFour() {
				System.out.println("[InnerFour] 생성자 실행됨!");
			}
		}
		 
		InnerFour in = new InnerFour();

	}
}

public class Ex04 {

	public static void main(String[] args) {

	}

}
