import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {
		// 사용자에게 정수 두개를 입력 받은 후, 큰 값만 출력
		// 단, 사용자는 같은 값을 입력하지 않는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 2개 입력해 주세요.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = (num1 > num2) ? num1 : num2;
		
		System.out.println("둘중에 더 큰 값은 " + max + "입니다.");
		sc.close();
	}

}
