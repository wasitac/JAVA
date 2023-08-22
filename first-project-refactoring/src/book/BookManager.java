package book;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManager {

	// [과제 2] 배열 대신 ArrayList 사용
	private ArrayList<AnimalInfo> infoStorage = new ArrayList<>();

	public void inputData(Scanner scanner) throws InputMismatchException {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = scanner.next();
		System.out.print("2. 나이 : ");
		int age = scanner.nextInt();
		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}

	// 요소 출력 -------------------------------------------------------------------
	public void showBook() {
		System.out.println("<< 저장 목록 >>");

		// [과제]향상된for문 사용하기
		for (AnimalInfo info : infoStorage) {
			info.showAmimalInfo();
		}
	}
}
