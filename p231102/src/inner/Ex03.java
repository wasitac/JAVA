package inner;

class OuterThree {
	
	InnerInstance in = new InnerInstance();
	
	// instance method 
	public void instanceMethod() {
		InnerInstance in = new InnerInstance();
		InnerStatic ins = new InnerStatic();
	}
	// static method
	public static void staticMethod() {
		//static 멤버는 instance 멤버를 사용하지 못 한 다
//		InnerInstance in = new InnerInstance();
		InnerStatic ins = new InnerStatic();
	}
	
	// instance class
	// Outer class의 instance method 사용(접근) 가능
	private class InnerInstance {}
	
	// static class
	// Outer class의 instance method, static method에서 사용 가능
	private static class InnerStatic {}
}

public class Ex03 {

}
