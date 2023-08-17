package exception;

import java.util.Scanner;

/* [예외 처리]
 * 예측 가능한 에러
 * 에러 발생 --> 비정상 종료
 * 예측 가능한 에러 -> 처리 -> 정상 종료
 * 
 * 1) try~catch~finally : 직접 처리
 * 2) throws			: 예외 전가
 * 
 * try {
 * 	예외 발생 가능한 코드
 * } catch(예외클래스 참조변수) {
 * 	예외가 발생했을 때, 처리할 코드
 * } finally {
 * 	예외발생 여부와 상관 없이, try구문 마지막에 무조건 실행할 코드
 * }
 * 
 * 
 */

public class Ex01 {

	public static void inputData() {
		System.out.println("inputData method...시작");
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 2개 입력 : ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		int result1 = 0;
		int result2 = 0;

		result1 = n1 / n2;
		result2 = n1 % n2;
		System.out.println("몫 : " + result1);
		System.out.println("나머지 : " + result2);

		System.out.println("inputData method...끝");
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println("[main method] >>> START");
		inputData();
		System.out.println("[main method] >>> END");
	}

}
