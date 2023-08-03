/*
 * [배열] array
 * : 하나의 이름으로 여러 값(요소, 원소, 객체)을 관리
 * : 여러 값이 메모리에 연속 할당
 * : 여러 값을 구분하기 위해 인덱스 사용
 *  ->인덱스(index)는 0부터 시작
 *  
 *  : 자바는 무조건 배열을 객체로 생성 -> heap영역 생성
 *  : 그래서 주소로 접근(간접 접근)
 *  
 *  :[문법]
 *   자료형[] 배열명 = new 자료형[길이];
 * 
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		// [우리 반 학생들의 수학 점수 저장] =====
		// 1. 배열 생성 --------------------
		// 1-1) 참조 변수 선언
		int[] math;
		// 자료형[] 참조변수

		// 1-2) 배열 생성
		math = new int[5];
		// 참조변수 = new 자료형[길이]
		// int형의 길이가 5인 1차원 배열을 heap 영역에 생성 후, 주소를 참조변수 math에 저장

		// 2. 배열 요소에 값 설정--------------
		math[0] = 80;
		math[1] = 95;
		math[2] = 90;
		math[3] = 70;
		math[4] = 100;
		// 배열 요소에 저장된 값 출력
		// 배열의 길이가 저장된 변수 : length
		// 참조변수.length
		System.out.println("배열 길이 >> " + math.length);

		// for문으로 구현
		for (int i = 0; i < math.length; i++)
			System.out.printf("math[%d] >> %d\n", i, math[i]);

		// 향상된 for문 (배열에서 사용)
		// [문법]
		// for(자료형 변수명: 배열의 참조변수){
		// 	명령어;
		// }
	}

}
