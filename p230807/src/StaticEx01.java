/*
 * [변수 종류]
 * ------------------------------------------------------------------------------
 *                  | 메모리 영역			| 메모리 할당 시기		| 초기화를 하지 않으면
 * ------------------------------------------------------------------------------
 * local variable	| stack				| 해당 영역이 실행		| 쓰레기 값
 * instance field	| heap				| 인스턴스 생성될 때		| 0 or null
 * static	field	| static(class)		| 클래스가 로드 될 때		| 0 or null
 * ------------------------------------------------------------------------------
 * 
 * [static]
 * - static(class) field====================================
 *  : class가 메모리에 로드(load)될 때, static(class)영역에 할당
 *  : 클래스 명으로 관리 --> 클래스명으로 접근
 *  : instance(object, 객체) 생성과 상관없이 접근(사용) 가능
 *  	--> 객체 생성과 상관없이 변수 사용하고자 할 때
 *  : [문법] 클래스명.변수명
 *  : 해당 클래스로 생성된 객체들이 공유하는 변수
 *  : instance(object, 객체) 생성 없이 멤버변수 사용하고자 할 때,
 *    static(class) field로 선언
 * 
 * - static(class) method===================================
 *  : class가 메모리에 로드(load)될 때, static(class)영역에 할당
 *  : 클래스명으로 관리 --> 클래스명으로 접근
 *  : instance(object, 객체) 생성과 상관없이 호출(사용) 가능
 *  --> 객체 생성과 상관없이 메서드 호출(사용)하고자 할 때
 *  :static(class) 메서드 내에서는 static 멤버만 접근(사용) 가능
 *  --> 생성 시기가 다름
 *  --> static 멤버가 메모리 할당된 후, 
 *  	객체 생성 시 instance 멤버가 메모리 할당 됨
 *  [문법] 클래스명.메서드명()
 *  : 해당 클래스로 생성된 객체들이 공유하는 메서드
 *  : instance(object, 객체)생성 없이 멤버 메서드 호출하고자 할 때,
 *  	static(class) method로 정의
 *  ========================================================
 */

class Number {
	// static field
	static int one;
	// instance field
	int two;

	// [constructor]
	public Number(int two) {
		this.two = two;
	}

	/* [method]===============================================
	 * instance method	| heap				| 인스턴스 생성될 때
	 * static	method	| static(class)		| 클래스가 로드 될 때
	*/
	//static method 안에서는 static 멤버만 접근(사용) 가능하다
	static void staticShow() {
		System.out.printf("[static method] one : %d\n", one);
	}
	void show() {
		System.out.printf("[non-static method] one : %d, two : %d\n", one, two);
	}

}

public class StaticEx01 {

	public static void main(String[] args) {
		// static field 접근
		Number.one = 5;
		System.out.println("static field >> " + Number.one);
//		System.out.println("instance field >> " + Number.two);
		
		//static method 호출
		Number.staticShow();
		
		//instance(object, 객체)생성
		Number number = new Number(100);
		Number numberTwo = new Number(202);
		number.show();
//		number.one = 1;
//		System.out.println(number.one);
	}

}
