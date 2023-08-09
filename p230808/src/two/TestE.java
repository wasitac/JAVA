package two;

import one.TestA;

//상속
public class TestE extends TestA{
	void show() {
//		System.out.println(num1); //error! private
//		System.out.println(num2); //error! default
		System.out.println(num3);
		System.out.println(num4);
	}
}
