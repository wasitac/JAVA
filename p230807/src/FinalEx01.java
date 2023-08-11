/*
 * cf) final =====
 * final 변수
 * final 메서드
 * final 클래스
 * ===============
 * 
 * [final 변수]
 * : 초기화한 값으로 변수의 값 고정 
 * : 변경 금지		==> 값 변경 금지
 * : 변수를 상수화	==> 상수(constant)
 * : 이름 있음
 * : 전부 대문자로 짓는게 규칙
 * 
 * [literal 리터럴]
 * : 값 그 자체
 */
public class FinalEx01 {

	public static void main(String[] args) {
		// 지역변수 ================
		// 변수 선언과 동시에 초기화
		final float PI = 3.14F;
		//PI = 5.5F		//error
		// 변수 선언
		final int NUM;

		// 초기화
		NUM = 5;

		// 값 변경 error
//		NUM = 7;
		System.out.println(NUM);
	}

}
