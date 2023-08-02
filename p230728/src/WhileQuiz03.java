import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 사용자에게 정수를 입력 받아서, 누적합 출력
		 * 
		 * <<입력 형태>>
		 * 정수 1개를 입력하세요... 5
		 * 정수 1개를 입력하세요... 2
		 * 정수 1개를 입력하세요... 6
		 * 정수 1개를 입력하세요... -1
		 * -1을 입력하면 멈추기
		 * 총합 : 10
		 */
		int sum = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (num != -1) {
			System.out.println("정수 1개를 입력하세요... ");
			num = scanner.nextInt();
			sum += num;
		}
		
		System.out.println("총합 : " + sum);
		
		scanner.close();
	}

}
