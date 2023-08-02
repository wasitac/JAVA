import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 사용자에게 정수 1개를 입력 받은 후 출력하시오.
		 * 이후 문자열 1개를 입력 받은 후 출력하시오.
		 *
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();
		
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		System.out.println(str);
		
		sc.close();
	}

}
