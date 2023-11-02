import book.BookManager;
import book.Menu;

// [과제 1] ==========================================
// 1) Scanner 객체 1개만 생성

// 2) BookManager class
//    * showBook() : for --> enhanced for loop 변경 

// 3) AnimalBook class
//    * main()     : if -> switch 변경
// ===================================================

// [과제 2] ==========================================
// 1) BookManager class
//    * ArrayList 사용
// ===================================================

// [과제 3] ==========================================
// 1) main method  : 같은 이름은 저장하지 않는다!
//    1. 정보 입력
//    2. 정보 검색
//    3. 정보 삭제
//    4. 전체 정보
//    5. 종료

// 2) BookManager class
// 2-1) deleteData() 구현
// 2-2) searchData() 구현

// [과제 4] ===================================================
// 1) main method 내 메뉴를 Menu class 내 show 메서드 구현
//
// 2) BookManager class
//    2-1) inputData(), searchData(), deleteData() 메서드 내
//         중복된 코드를 메서드로 구현 : search()
//    2-2) updateData() 구현
//         : 이름을 입력 받은 후, 나이 수정
// ============================================================

public class AnimalBook {
	private static BookManager manager = new BookManager();	

	public static void main(String[] args) {
		System.out.println("ddd");
		menu:
		while(true) {
			Menu.show();
			int choice = BookManager.input.nextInt();
			
			switch(choice) {
			case 1: // 1. 정보 입력
				manager.inputData();
				break;
			case 2: // 2. 정보 검색
				manager.searchData();
				break;
			case 3: // 3. 정보 수정
				manager.updateData();
				break;
			case 4: // 4. 정보 삭제
				manager.deleteData();
				break;
			case 5: // 5. 전체 정보
				manager.showBook();
				break;
			case 6: // 6. 종료
				break menu;
			}
		}	
	}
}
