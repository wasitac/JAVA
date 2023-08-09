package one;

public class TestB {
	// 인스턴스(객체) 생성
	TestA a = new TestA();

	void show() {
//		System.out.println(a.num1); // error
		System.out.println(a.num2); // default - 같은 패키지
		System.out.println(a.num3); // protected - 같은 패키지, 자식
		System.out.println(a.num4); // public - 전부 다

	}
}
