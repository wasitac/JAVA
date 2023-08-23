import java.util.Scanner;

import book.BookManager;
	//[과제3]
	// main method
	// 1. 정보 입력 : 같은 이름은 저장하지 않는다.
	// 2. 정보 검색
	// 3. 정보 삭제
	// 4. 전체 정보
	// 5. 종료

public class AnimalBook {
	// field
	private static BookManager manager = new BookManager();

	public static void main(String[] args) {
		Scanner scanner = BookManager.scanner;
		
		outer: while (true) {
			System.out.println("[메뉴를 선택하세요]");
			System.out.println("1. 정보 입력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 정보 삭제");
			System.out.println("4. 전체 정보");
			System.out.println("5. 종료");
			System.out.print("선택... ");

			int answer = scanner.nextInt();

			switch (answer) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				manager.showBook();
				break;
			case 5:
				System.out.println("종료합니다.");
				break outer;
			default:
				System.out.println("1 ~ 5 중 하나를 입력하세요...\n");
			}
		}
		scanner.close();
	}
}
