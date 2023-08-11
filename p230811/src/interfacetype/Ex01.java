package interfacetype;

/*
 * [interface] 인터페이스 =====================
 * : 참조형 (참조 자료형)
 * : abstract class의 upgrade된 자료형
 * : abstract class 보다 엄격해진 자료형
 * : 인스턴스 생성 불가능 -> 다형성 또는 상속으로 사용
 * 
 * [field] 멤버 변수
 *  public static final로 고정 ==> constant(상수) ==> 대문자
 * 
 * [method] 멤버 메서드
 *  public abstract
 *  추상 메서드
 * =========================================
 */
interface Field{
	int num1 = 100;
	static int num2 = 200;
	final int num3 = 300;
	public static final int num4 = 400;
	
}

interface A {}
interface B {}
interface C extends A {}
interface D extends A, B {} // 다중 상속 허용

class E {}
class F {}
class G extends E {}
//class H extends E, F{}  //error 다중 상속 불허용
class I implements A, B {}
class J extends E implements A, B {}
//class K implements A {} extends E {} // Error! 클래스 먼저 상속받아야함
//interface L implements E {} // interface는 class를 부모로 둘 수 없다.

//같은 자료형 간의 상속은 '확장하다'라는 뜻의 extends를 쓰지만 다른 타입끼리의 상속은 '구현하다'라는 뜻인 implements를 사용한다.
public class Ex01 {

	public static void main(String[] args) {
		//Field field = new Field();
		Field f;
		System.out.println(Field.num1);
		System.out.println(Field.num2);
		System.out.println(Field.num3);
		System.out.println(Field.num4);
		
//		Field.num1 = 1; //interface의 필드는 자동으로 public static final 으로 선언된다. 
		
	}

}
