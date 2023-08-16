package study;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int sum = 0;
		int userValue;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력[종료는 0 입력]");
		
		do {
			System.out.print(">> ");
			userValue = scanner.nextInt();
			sum += userValue;
		} while (userValue != 0);
		
		System.out.println("합계 : " + sum);
		
		scanner.close();
	}

}
