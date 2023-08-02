/*
 * [메서드 정의]=================================
 * 기능 : 매개변수가 정수 1개를 받아서, 팩토리얼 결과 리턴
 * 메서드명 : factorial, 매개변수 : 1개, 리턴값 : 있음
 * ===========================================
 */
public class MethodQuiz03 {
	//[방법1]----------------------------------
//	public static int factorial(int num) {
//		int fac = 1;
//		for (int i = 2; i <= num; i++)
//			fac *= i;
//		return fac;
//	}
	//[방법2]----------------------------------
	//재귀 메서드
	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
//		int num = 6;
//		System.out.printf("%d! = %d", num, factorial(num));
	}

}
