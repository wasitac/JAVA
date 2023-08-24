package book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// ArrayList
public class BookManager {
	public static Scanner scanner = new Scanner(System.in);
	HashSet<AnimalInfo> infoStorage = new HashSet<>();

	private Iterator<AnimalInfo> search(String name) {
		Iterator<AnimalInfo> iter = infoStorage.iterator();
		while (iter.hasNext())
			if (iter.next().getName().equals(name)) {
				return iter;
			}
		return null;
	}

	// 입력 -----------------------------------------------------------------------
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = scanner.next();
		Iterator<AnimalInfo> result = search(name);

		if (result != null) {
			System.out.println("중복된 이름이 존재합니다.\n");
			return;
		}

		System.out.print("2. 나이 : ");
		int age = scanner.nextInt();
		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.\n");

	}

	// 삭제 -----------------------------------------------------------------------
	public void deleteData() {
		System.out.print("삭제할 이름을 입력하세요...");
		String name = scanner.next();
		Iterator<AnimalInfo> result = search(name);

		if (result == null) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}

		result.remove();
		System.out.println("데이터 삭제 완료\n");
		return;
	}

	// 검색 -----------------------------------------------------------------------
	public void searchData() {
		System.out.print("검색할 이름을 입력하세요...");
		String name = scanner.next();
		Iterator<AnimalInfo> result = search(name);

		if (result == null) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}

		AnimalInfo a = (AnimalInfo)result;
		a.showAmimalInfo();
		System.out.println("데이터 검색이 완료되었습니다.");
	}

	// 수정 ------------------------------------------------------------------------
	public void updateData() {
		System.out.print("나이를 수정할 대상의 이름을 입력하세요...");
		String name = scanner.next();
		System.out.print("수정할 나이를 입력하세요...");
		int age = scanner.nextInt();
		Iterator<AnimalInfo> result = search(name);

		if (result == null) {
			System.out.println("해당 데이터는 없습니다.\n");
			return;
		}

		infoStorage.get(result).setAge(age);
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
