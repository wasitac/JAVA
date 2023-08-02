/*
 * 문제
 * 짝수 단과 홀수 단을 0과 1을 입력 받아서 출력
 * 
 * 입력 형태
 * 짝수 단은 0, 홀수 단은 1을 입력 : 0
 */

import java.util.Scanner;

public class NestedLoopQuiz04 {

	public static void main(String[] args) {
		System.out.println("짝수 단은 0, 홀수 단은 1을 입력 : ");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 2 + num; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			System.out.println();
		}
	
		scanner.close();
	}

}
