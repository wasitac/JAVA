package interfacetype;

/*
 *  [interface] 자료형=======================================
 *  : abstract class 보다 엄격해진 자료형
 *  : abstract class의 upgrade된 자료형
 *  : 객체(인스턴스) 생성 불가능 --> 상속 or 다형성 사용
 *  : 다중 상속 허용
 *  
 *  [field]================================================
 *  public static final 고정 ==> constant(상수) ==> 대문자
 *  
 *  [method]===============================================
 *  public abstract ==> 추상 메서드
 */

interface Method {
	void one();
	public abstract void two();
	
	//default method : java 8 버전부터 지원됨
	default void defaultMethod() {
		System.out.println("[Method interface] default 멤버 메서드");
	}
	
	//static method : java 8 버전부터 지원됨
	static void staticMethod() {
		System.out.println("[Method interface] static 멤버 메서드");
	}
}

class Sub implements Method {

	@Override
	public void one() {
		System.out.println("[Sub] 오버라이딩된 메서드 one() 실행됨");
	}

	@Override
	public void two() {
		System.out.println("[Sub] 오버라이딩된 메서드 two() 실행됨");
	}
	
	@Override
	public void defaultMethod() {
			
		Method.super.defaultMethod();
	}

}

public class Ex01 {
	public static void main(String[] args) {
		// 1. interface는 인스턴스 생성 불가능!
		Sub s = new Sub();
		
		// 2.다형성
		Method m = new Sub();
		m.one();
		m.two();
		m.defaultMethod();
		Method.staticMethod();
	}
}
