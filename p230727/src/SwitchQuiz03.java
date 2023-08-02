/*
문제
정수 2개와 사칙연산 기호를 입력 받은 후, 식과 계산된 값 출력
단, 정수 먼저 입력 받기

입력형태
정수 2개를 입력하세요... 5 2
사칙연산(+, -, *, /) 중 하나를 입력하세요... + 

출력형태
5 + 2 = 7

+, -, *, / 이외의 기호를 입력했을 경우
잘못된 연산자를 입력하셨군요!
*/

import java.util.Scanner;

public class SwitchQuiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요... ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int ans = 0;
		
		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요... ");
		String mark = scanner.next();
		
		switch (mark) {
		case "+":
			ans = num1 + num2;
			System.out.printf("%d %s %d = %d", num1, mark, num2, ans);
			break;
		case "-":
			ans = num1 - num2;
			System.out.printf("%d %s %d = %d", num1, mark, num2, ans);
			break;
		case "*":
			ans = num1 * num2;
			System.out.printf("%d %s %d = %d", num1, mark, num2, ans);
			break;
		case "/":
			ans = num1 / num2;
			System.out.printf("%d %s %d = %d", num1, mark, num2, ans);
			break;

		default:
			System.out.println("잘못된 연산자를 입력하셨군요!");
			break;
		}

		scanner.close();
		
	}

}
