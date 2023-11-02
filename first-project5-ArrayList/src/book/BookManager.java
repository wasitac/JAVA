package book;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList
public class BookManager {
	public static Scanner scanner = new Scanner(System.in);
	ArrayList<AnimalInfo> infoStorage = new ArrayList<>();

	private int search(String name) {
		int index = -1;
		for (AnimalInfo animalInfo : infoStorage) {
			if (animalInfo.getName().equals(name)) {
				index = infoStorage.indexOf(animalInfo);
				return index;
			}
		}
		return index;
	}

	// 입력 -----------------------------------------------------------------------
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = scanner.next();
		int index = search(name);

		if (index > -1) {
			System.out.println("중복된 이름이 존재합니다.\n");
			return;
		}

		System.out.print("2. 나이 : ");
		int age = scanner.nextInt();
		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.\n");
		System.out.println(infoStorage);

	}

	// 삭제 -----------------------------------------------------------------------
	public void deleteData() {
		System.out.print("삭제할 이름을 입력하세요...");
		String name = scanner.next();
		int index = search(name);

		if (index == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}

		infoStorage.remove(index);
		System.out.println("데이터 삭제 완료\n");
		return;
	}

	// 검색 -----------------------------------------------------------------------
	public void searchData() {
		System.out.print("검색할 이름을 입력하세요...");
		String name = scanner.next();
		int index = search(name);
		
		if (index == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}
		
		infoStorage.get(index).showAmimalInfo();
		System.out.println("데이터 검색이 완료되었습니다.");
	}

	// 수정 ------------------------------------------------------------------------
	public void updateData() {
		System.out.print("나이를 수정할 대상의 이름을 입력하세요...");
		String name = scanner.next();
		System.out.print("수정할 나이를 입력하세요...");
		int age = scanner.nextInt();
		int index = search(name);

		if (index == -1) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}

		infoStorage.get(index).setAge(age);
		System.out.println("수정이 완료됐습니다.");
	}

	// 요소 출력 -------------------------------------------------------------------
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for (AnimalInfo animalInfo : infoStorage) {
			animalInfo.showAmimalInfo();
		}
	}
}
