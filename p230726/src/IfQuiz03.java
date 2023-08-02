/*
 * 문제
 * 점수를 입력 받은 후, 학점을 출력하시오.
 * 
 * 97~100 : A+
 * 94~96 : A0
 * 90~93 : A-
 * 87~89 : B+
 * 84~86 : B0
 * 80~83 : B-
 * 77~79 : C+
 * 74~76 : C0
 * 70~73 : C-
 * 나머지 : F
*/

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int score = sc.nextInt();
		char grade = '\0';
		char plus = '0';
		int ten = score / 10;
		int one = score % 10;
		
		if ((one >= 7) || (score==100))
			plus = '+';
		else if (one <= 3)
			plus = '-';
		
		if (ten >= 9) 
			grade = 'A';
		else if (ten >= 8)
			grade = 'B';
		else if (ten >= 7)
			grade = 'C';
		else {
			grade = 'F';
			plus = '\0';
		}
		
		System.out.printf("학점은 %c%c", grade, plus);
		sc.close();
	}
		
}

