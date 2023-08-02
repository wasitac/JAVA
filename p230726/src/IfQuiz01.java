/* 문제
 * 사용자에게 정수 두개를 입력 받은 후 큰 값 작은 값을 출력하시오.
 * 출력 형태>
 * 큰 값 : 9, 작은 값 : 7
 */

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력해 주세요.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) 
			System.out.println("큰 값 : " + num1 + ", 작은 값 : " + num2);
		else 	
			System.out.println("큰 값 : " + num2 + ", 작은 값 : " + num1);
		sc.close();
	}

}
