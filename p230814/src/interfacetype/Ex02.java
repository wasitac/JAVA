package interfacetype;

interface Test {
	int num;
	
}

class SubTest implements Test {
//	int one;
//	public SubTest(int one) {
//		this.one = one;
//	}
	
	public SubTest(int num) {
		super.num = num;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		SubTest st = new SubTest();
	}
}
