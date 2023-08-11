/* 반복문 안에 반복문이 반드시 들어가야 하는지 생각해보기.
 * 값을 반복적으로 입력받는 문제일 때 일단 무한루프로 틀을 잡고 
 * 문제가 해결되면 무한루프를 탈출하는 스타일로 작성하는 버릇이 있는것 같다.
 */
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fac = 1;
		int userValue;

		do {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = scanner.nextInt();
		} while ((userValue > 0) && (userValue < 11));

		for (int i = 1; i <= userValue; i++) {
			fac *= i;
		}
		
		System.out.printf("%d! : %d\n", userValue, fac);

		scanner.close();
	}

}