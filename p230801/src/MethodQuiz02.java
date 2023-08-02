/*
 * [메소드 정의]===================================================
 * 기능 : 매개변수로 정수 2개를 받아서 나눈 몫을 출력. 분모가 0이면 에러 메시지 출력
 * 메서드명 : divide, 매개변수 : 2개, 리턴값 : 없음
 * =============================================================
 */
public class MethodQuiz02 {

	public static void divide(int num1, int num2) {
// [방법1]=======================================================
//		if (num2 == 0)
//			System.out.println("분모가 0으로 계산 불능");
//		else
//			System.out.println("나눗셈 결과 >> " + num1 / num2);

		
// [방법2]=======================================================
		if (num2 != 0) {
			System.out.println("나눗셈 결과 >> " + (num1 / num2));
			return;
		}
		
		System.out.println("분모가 0으로 계산 불능");
	}
	
	public static void main(String[] args) {
		divide(5, 3);
		divide(4, 0); //분모가 0으로 계산 불능
		divide(6, 2);
	
	}

}
