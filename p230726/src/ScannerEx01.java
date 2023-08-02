import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// 1. Scanner 객체생성
		Scanner input = new Scanner(System.in);

		// 2-1. 문자열 입력
		System.out.print("문자열 입력하세요...");
		String strOne = input.next();

		// 3-1. 출력
		System.out.println("입력받은 문자열 >> " + strOne);

		input.nextLine();

		// 2-2. 문자열 입력
		System.out.print("문자열 입력하세요...");
		String strTwo = input.nextLine();

		// 3-2. 출력
		System.out.println("입력받은 문자열 >> " + strTwo);
		
		//리소스 해제
		input.close();
	}

}
