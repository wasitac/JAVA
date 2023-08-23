import java.util.Scanner;

import book.BookManager;

/*
 * {과제]4 =============================================
 * 1) main method 내 메뉴를 Menu class 내 show 메서드 정의
 * 2) BookManager class
 * 	2-1) inputData(), deleteData(), searchData() 메서드 내 
 * 		 중복된 코드를 메서드로 구현 : search()
 */
class Menu {
	public static int show(Scanner scanner) {
		System.out.println("[메뉴를 선택하세요]");
		System.out.println("1. 정보 입력");
		System.out.println("2. 정보 검색");
		System.out.println("3. 정보 삭제");
		System.out.println("4. 전체 정보");
		System.out.println("5. 정보 수정");
		System.out.println("6. 종료");
		System.out.print("선택... ");

		int answer = scanner.nextInt();
		return answer;
	}
}

public class AnimalBook {
	// field
	private static BookManager manager = new BookManager();

	public static void main(String[] args) {

		Scanner scanner = BookManager.scanner;

		outer: while (true) {
			int answer = Menu.show(scanner);

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
				manager.updateData();
				break;
			case 6:
				System.out.println("종료합니다.");
				break outer;
			default:
				System.out.println("1 ~ 5 중 하나를 입력하세요...\n");
			}
		}
	}
}
