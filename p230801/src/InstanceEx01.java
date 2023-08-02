/*
 * - 클래스는 "자료형"이다!
 * - 참조 자료형(참조형, reference type)
 * 	  cf) 기본 자료형 (기본형, primitive type)
 * - 사용자 정의 자료형
 * 
 * - 클래스명은 대문자로 시작(문자로 시작)
 * - 클래스 내 멤버 : 변수, 메서드
 * 
 * [객체] object, instance ================================
 * - 클래스로 생성된 구체화(실체화)된 대상
 * - Java는 모든 객체를 heap 영역에 생성
 * - 객체가 heap 영역에 생성되면, 할당된 주소를 리턴 
 * - 생성된 객체는 반드시 주소를 통해 접근
 * 
 * [객체 생성 문법]
 * new 클래스명();
 */
//Student 클래스 정의
class Student{
	//멤버 변수
	int age;
	String name;
	
	//멤버 메서드

void study() {
		System.out.println("열심히 공부 중!");
	}
}

public class InstanceEx01 {

	public static void main(String[] args) {
		int num = 25;
		
		//[참조 자료형] reference type
		// 1) 참조변수 선언
		// [문법] 클래스명 변수명;
		Student hong;
		//자료형 변수;
		//class 참조변수;
		
		// 2) 인스턴스 생성
		// [문법] new 클래스명();
		hong = new Student();
		//참조변수 = new class();
		//참조변수 = heap영역에 class 멤버를 메모리 할당
		
		System.out.println("num >> " + num);
		
		//인스턴스의 멤버 변수 접근 --------------------------
		System.out.println("홍길동 나이 >> " + hong.age);
		hong.age = 26;
		System.out.println("홍길동 나이 >> " + hong.age);
		
		System.out.println("홍길동 이름 : 초기값 >> " + hong.name);
		hong.name = "홍길동";
		System.out.println("홍길동 이름 : 초기값 >> " + hong.name);
		
		//인스턴스의 멤버 메서드 접근--------------------------
		//멤버 메서드 study 호출
		hong.study();
	}

}
