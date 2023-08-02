import java.util.Scanner;

public class IfEx06 {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 2. 정수 1개 입력
		System.out.println("정수 1개 입력 >> ");
		int value = scanner.nextInt();
		
		//3.출력
		// [출력 형태]
		// 0인 경우 : 입력한 숫자는 0 입니다.
		// 0이 아닌 경우 : 입력한 숫자는 0이 아닙니다
//		if (value == 0) {
//			System.out.println("0입니다.");
//		} else {
//			System.out.println("0이 아닙니다.");
//		}
		
		// 방법2
//		if (value == 0) {
//			System.out.println("0입니다.");
//		}
//		if (value != 0) {
//			System.out.println("0이 아니다.");
//		}
		
		// 방법3
		// 삼항 연산자
		String answer = (value == 0)? ("0입니다.") : ("0이 아닙니다.");
		System.out.println(answer);
		scanner.close();
	}
	

}
