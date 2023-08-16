package exception;

import java.util.Scanner;

// 예외 클래스 정의
// 1) 사용자에게 이름을 입력 받고, 출력하시오.
// 2) inputName() 메서드에서 이름을 입력 받으시오.
//  - inputName() 메서드는 ExceptionQuiz02 class의 멤버 메서드
//  - main() 메서드 내에서 inputName() 메서드 호출
// 3) 이름이 한 글자만 입력되면, NameLangthException 예외 발생
// 4) 예외가 발생했을 때, 출력문구 - class명 : 잘못된 이름 입력
// ========================================================

class NameLengthException extends Exception {
	/**
	 * 이름을 2글자 미만으로 입력했을 시 실행되는 예외입니다.
	 */
	private static final long serialVersionUID = 1L;

	public NameLengthException() {
		super("잘못된 이름을 입력했습니다.");
	}
}

public class ExceptionQuiz02 {

	static void inputName() throws NameLengthException {
		System.out.print("이름을 입력하시오(2글자 입력) >>> ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();

		if (name.length() < 2) {
			throw new NameLengthException();
		}

		System.out.println(name);
	}

	public static void main(String[] args) {
		try {
			inputName();
		} catch (NameLengthException e) {
			e.printStackTrace();
		}

	}

}
