package exception;

import java.util.Scanner;

//[ Exception class] 정의 ----------------------------
// : 음수를 입력하면, exception 발생

class NegativeNumberException extends Exception {
	/**
	 * 문서 주석 컴파일해도 안사라진다 멋지지 직 렬 화?
	 */
	private static final long serialVersionUID = 1L;

	// 음수를 입력하면, exception 발생
	public NegativeNumberException(int number) {
		super("음수" + number + "를 입력하셨군요");
	}
}

public class Ex07 {

	public static void inputNumber() throws NegativeNumberException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 1개 입력하세요...");
		int userNumber = scanner.nextInt();
		scanner.close();

		if (userNumber < 0) {
			throw new NegativeNumberException(userNumber);
		}

		System.out.println("입력된 값 : " + userNumber);

	}

	public static void main(String[] args) {
		try {
			inputNumber();
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}

}
