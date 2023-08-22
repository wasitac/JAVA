package book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManager {
	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;

	public void inputData() throws IndexOutOfBoundsException, InputMismatchException{
		// 정보를 입력받고 입력받은 정보를 배열에 저장
		System.out.println("<< 정보를 입력하세요 >>");
		// 이 메소드에서 scanner를 close하면 main 메서드의 scanner에서 
		// NoSuchElementException 예외가 발생해서 닫지 않고 둠.
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. 이름 : ");
		String name = scanner.next();

		System.out.print("2. 나이 : ");
		int age = scanner.nextInt();
		
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}

	public void showBook() {
		// 저장 목록 출력
		System.out.println("<< 저장 목록 >>");
		
		for (AnimalInfo info : infoStorage) {
			if(info==null)
				break;
			info.showAmimalInfo();
		}
	}
}
