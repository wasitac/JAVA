package inner;

class OuterTwo {
	int one;
	static int two;
	
	static class InnerTwo {
		// instance field
		int num = 5;
		
		// static field
		static int user = 10;
		
		//constructor
		public InnerTwo(){
			System.out.println("[InnerTwo] 생성자 실행됨!");
		}
		
		public void instanceMethod() {
			System.out.println("[instance field] num >>"+num);
			System.out.println("[static field] num >>"+user);
		}
		
		public static void staticMethod() {
//			System.out.println("[instance field] num >>"+num);
			System.out.println("[static field] num >>"+user);
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		OuterTwo ot = new OuterTwo();
		OuterTwo.InnerTwo in = new OuterTwo.InnerTwo();
		in.instanceMethod();
		OuterTwo.InnerTwo.staticMethod();
	}

}
