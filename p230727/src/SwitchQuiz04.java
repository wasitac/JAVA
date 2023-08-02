/*
 * 문제
 * 컴퓨터와 가위바위보 놀이
 * 컴퓨터는 1, 2, 3 중 하나를 랜덤값으로 computer변수에 저장
 * 
 * 입력형태
 * 가위(1), 바위(2), 보(3) 중 하나를 입력 >> 2
 * 
 * 출력형태
 * 비겼습니다.
 * 이겼습니다.
 * 졌습니다.
 */

import java.util.Scanner;

public class SwitchQuiz04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int computer = (int)(Math.random()*3) + 1;
		int myNum = scanner.nextInt();
		
		switch (computer - myNum) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1: case -2:
			System.out.println("사용자가 졌습니다");
			break;
		case -1: case 2:
			System.out.println("사용자가 이겼습니다");
		}
		
		System.out.printf("사용자 %d, 컴퓨터 %d", myNum, computer);
		
		scanner.close();
	}

}
