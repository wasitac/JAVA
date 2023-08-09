import java.util.Scanner;

public class Quiz01_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userValue = 0;
		do {
			System.out.print("1~10 사이의 정수 입력 >> ");
			userValue = scanner.nextInt();
		} while (userValue < 1 || userValue > 10);

		System.out.println(userValue + "! = " + factorial(userValue));
		scanner.close();
	}

	// 팩토리얼 출력
	public static int factorial(int num) {
		if (num == 1)
			return 1;
		return num * factorial(num-1);
	}

}
