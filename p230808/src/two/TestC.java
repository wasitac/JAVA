package two; //현재 TestC 파일의 위치(경로)

import one.TestA; //다른 파일(타입)의 위치(경로)

public class TestC {
	TestA a = new TestA();
	void show() {
//	System.out.println(a.num1); // error! private - 멤버만
//	System.out.println(a.num2); // error! default - 같은 패키지
//	System.out.println(a.num3); // error! protected - 같은 패키지, 자식
	System.out.println(a.num4); // public - 전부 다
	}
}
