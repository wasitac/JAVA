package book;

import java.util.Scanner;

public class MenuView {
	public static final Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("<< 동물병원 회원 정보 관리 >>");
		System.out.println("1. 정보 저장\n"
				+ "2. 정보 조회\n"
				+ "3. 정보 수정\n"
				+ "4. 정보 삭제\n"
				+ "5. 정보 전체 출력\n"
				+ "6. 정보 전체 삭제\n"
				+ "7. 프로그램 종료"
				);
		System.out.print("선택 : ");
	}
}
