import java.util.InputMismatchException;
import java.util.Scanner;

import book.BookManager;

public class AnimalBook {
	// field
	private static BookManager manager = new BookManager();

	public static void main(String[] args) {
		// [과제]프로젝트 내에서 scanner 한개만 생성하기
		Scanner scanner = new Scanner(System.in);

		outer: while (true) {
			System.out.print("정보 입력할까요? (Y/N) ... ");
			String answer = scanner.next().toUpperCase();
			// [과제]if를 switch로 바꾸기
			switch (answer) {
			case "Y": case "YES":
				try {
					manager.inputData(scanner);
				} catch (InputMismatchException e) {
					System.out.println("나이는 정수로 입력해 주세요");
					scanner.nextLine();
				}
				break;
			case "N": case "NO":
				break outer;
			default:
				System.out.println("Y/N 둘 중 하나를 입력하세요...\n");
			}		
		}
		System.out.println("정보 입력을 종료합니다.\n");
		scanner.close();
		manager.showBook();
	}
}
