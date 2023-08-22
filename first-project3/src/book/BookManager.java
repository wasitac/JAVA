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
	public int isTarget(String name) {
		int target = -1;
		for (int i = 0; i < index; i++) {
			if (infoStorage[i].getName().equals(name))
				target = i;
		}
		return target;
	}

	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = scanner.next();
		// 이름 중복 검사
		if (isTarget(name) == -1) {
			System.out.print("2. 나이 : ");
			int age = scanner.nextInt();
			infoStorage[index++] = new AnimalInfo(name, age);
			System.out.println("데이터 입력이 완료되었습니다.\n");
		} else {
			System.out.println("중복된 이름이 존재합니다.\n");
		}

	}

	// 삭제 -----------------------------------------------------------------------
	public void deleteData() {
		// 이름을 입력 받은 후, 삭제
		// 있으면 삭제후 : 데이터 삭제가 완료.
		// 없으면 문구 출력 : 해당 데이터는 없습니다.
		System.out.println("삭제할 이름을 입력하세요.");
		String name = scanner.next();
		int target = isTarget(name);

		if (target != -1) {
			for (int i = target; i < index--; i++) {
				infoStorage[i] = infoStorage[i + 1];
			}
			System.out.println("데이터 삭제 완료\n");
		} else {
			System.out.println("해당 데이터는 없습니다.\n");
		}
	}

	// 검색 -----------------------------------------------------------------------
	public void searchData() {
		// 이름을 입력 받은 후, 검색 결과 출력
		// 있으면 출력 : 이름과 나이
		// 없으면 문구 출력 : 해당 데이터는 없습니다.
		System.out.println("검색할 이름을 입력하세요");
		String name = scanner.next();
		int target = isTarget(name);

		if (target != -1) {
			System.out.println("이름 : " + infoStorage[target].getName());
			System.out.println("나이 : " + infoStorage[target].getAge());
		} else {
			System.out.println("해당 데이터는 없습니다.\n");
		}
	}

	// 요소 출력 -------------------------------------------------------------------
	public void showBook() {
		System.out.println("<< 저장 목록 >>");

		for (AnimalInfo info : infoStorage) {
			if (info == null)
				break;
			info.showAmimalInfo();
		}
	}
}
