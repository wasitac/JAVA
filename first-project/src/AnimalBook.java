import java.util.InputMismatchException;
import java.util.Scanner;
import book.BookManager;

public class AnimalBook {
	// field
	private static BookManager manager = new BookManager();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("정보 입력할까요? (Y/N) ... ");
			String start = scanner.next();
			
			if (start.equalsIgnoreCase("y") || start.equalsIgnoreCase("yes")) {
				try {
					manager.inputData();
				} catch (IndexOutOfBoundsException e) {
					System.out.println("배열의 길이를 초과했습니다");
				} catch (InputMismatchException e) {
					System.out.println("나이는 정수로 입력해 주세요");
				}
			} else if (start.equalsIgnoreCase("n") || start.equalsIgnoreCase("no")) {
				break;
			}
		}
		System.out.println("정보 입력을 종료합니다.\n");
		scanner.close();
		manager.showBook();
	}
}
