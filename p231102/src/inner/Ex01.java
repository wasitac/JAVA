package inner;

interface Yahoo {
	abstract void showNum();
}

class Outer {
	public Yahoo getInner(int num) {
		return new Inner(num);
	}

	private class Inner implements Yahoo {
		int num;

		public Inner(int num) {
			this.num = num;
			System.out.println("[Inner class] 생성자 실행!");
		}

		public void showNum() {
			System.out.println("[Inner class - instance field] num >> " + this.num);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Outer outer = new Outer();
//		Outer.Inner in = outer.new Inner(5);
//		in.showNum();
		Outer outer = new Outer();
		Yahoo in = outer.getInner(5);
		in.showNum();
	}

}
