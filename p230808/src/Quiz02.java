import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10) + 1;
		int count = 0;
		int userNum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");

		while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			userNum = scanner.nextInt();
			if (userNum < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else if (userNum > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else {
				System.out.printf("%d번만에 정답입니다.", count);
				break;
			}
		}

		scanner.close();
	}

}
