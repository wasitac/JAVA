package book;

import java.util.Scanner;

//bookmanager class
//arraylist 사용하지 않습니다
//deleteData 구현
//searchData 구현

public class BookManager {
	public static Scanner scanner = new Scanner(System.in);
	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;

	// 이름을 입력받고 배열에 같은 이름이 있으면 해당 인덱스를 반환, 없으면 -1을 반환하는 메서드
	private int search(String name) {
//굳이 변수를 하나 더 만들 필요가 없었다. 
		// int target = -1;
		for (int i = 0; i < index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				// target = i;
// 여기 return을 넣으면 이미 이름이 같은 인덱스를 찾고도 for문이 돌아가는걸 막을 수 있겠다.
				// return target;
				return i;
			}
		}
		return -1;
	}

	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = scanner.next();
		scanner.nextLine();
		// 이름 중복 검사
		int nameIndex = search(name);
		
		if (nameIndex > -1) {
			System.out.println("중복된 이름이 존재합니다.\n");
			return;
		}
		
		System.out.print("2. 나이 : ");
		int age = scanner.nextInt();
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}

	// 삭제 -----------------------------------------------------------------------
	public void deleteData() {
		// 이름을 입력 받은 후, 삭제
		// 있으면 삭제후 : 데이터 삭제가 완료.
		// 없으면 문구 출력 : 해당 데이터는 없습니다.
		System.out.print("삭제할 이름을 입력하세요...");
		String name = scanner.next();

		int nameIndex = search(name);
		// 부정(!=)은 사고단계가 한단계 늘어난다.
//		if (nameIndex > -1) {
//			for (int i = nameIndex; i < index; i++) {
//				infoStorage[i] = infoStorage[i + 1];
//			}
//			infoStorage[index--] = null;
//			System.out.println("데이터 삭제 완료\n");
//		} else {
//			System.out.println("해당 데이터는 없습니다.\n");
//		}
		// 제어문 중첩을 최대한 피해야 한다.
		if (nameIndex == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		
		// 삭제하는 데이터가 제일 끝 인덱스에 있는경우 i+1 인덱스는 범위 밖이다. 수정해야함
		for (int i = nameIndex; i < index - 1; i++)
			infoStorage[i] = infoStorage[i + 1];
// 이미 마지막 인덱스에 null이 들어가 있잖아
		// for를 index-1까지만 돌고 마지막 인덱스는 직접 null을 넣으면 outOfIndex해결가능. 얻어걸렸네
		// 근데 어차피 for문 범위 -1안해줘서 오류 발생했을거다
		infoStorage[index--] = null;
//		index--;
		System.out.println("데이터 삭제 완료\n");
		return;
	}

	// 검색 -----------------------------------------------------------------------
	public void searchData() {
		// 이름을 입력 받은 후, 검색 결과 출력
		// 있으면 출력 : 이름과 나이
		// 없으면 문구 출력 : 해당 데이터는 없습니다.
		System.out.print("검색할 이름을 입력하세요...");
		String name = scanner.next();

		int nameIndex = search(name);

		if (nameIndex == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		
		infoStorage[nameIndex].showAmimalInfo();
		System.out.println("데이터 검색이 완료되었습니다.");
	}

	public void updateData() {
		// 이름을 입력 받은 후, 나이 수정
		System.out.print("수정할 이름을 입력하세요...");
		String name = scanner.next();

		System.out.print("나이를 입력하세요...");
		int age = scanner.nextInt();

		int nameIndex = search(name);
		
		if (nameIndex == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		
		infoStorage[nameIndex].setAge(age);
		System.out.println("데이터 수정이 완료됐습니다.");
	}

	// 요소 출력 -------------------------------------------------------------------
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
// 배열을 사용하면서 중간에 null이 나오지 않게 수정했다.
// index로 일반for문 도는게 더 나을듯. if가 하나 덜들어가잖아
//		for (AnimalInfo info : infoStorage) {
//			if (info == null)
//				break;
//			info.showAmimalInfo();
//		}
		for (int i = 0; i < index; i++)
			infoStorage[i].showAmimalInfo();
	}
}
