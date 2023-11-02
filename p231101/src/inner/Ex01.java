package inner;

class Outer {
	// instance field
	int ou;
	
	// [inner class] 내부 클래스
	class Inner {
		// instance field
		int num;
		// constructor
		public Inner(int num) {
			this.num = num;
			System.out.println("inner class 생성됨");
		}
		
		void showNum() {
			System.out.println("[Inner Class] num >> " + this.num);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// inner class 인스턴스 생성
//		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner(5);
		// 한줄로
		Outer.Inner in = new Outer().new Inner(0);
		in.showNum();
	}

}
