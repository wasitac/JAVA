import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fac = 1;
		
		while (true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			int userValue = scanner.nextInt();
			
			if ((userValue > 0) && (userValue < 11)) {
				for (int i = 1; i <= userValue; i++) {
					fac *= i;
				}
				System.out.printf("%d! : %d\n", userValue, fac);
				break;
			}
		}
		
		scanner.close();
	}

}
