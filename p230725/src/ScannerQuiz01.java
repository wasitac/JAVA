import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {
		// 사용자에게 정수 2개를 입력받은 후, 덧셈 결과를 출력하시오.
		int userValueOne = 0;
		int userValueTwo = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		userValueOne = scanner.nextInt();
		userValueTwo = scanner.nextInt();
		
		System.out.println(userValueOne + userValueTwo);
		scanner.close();
	}

}
