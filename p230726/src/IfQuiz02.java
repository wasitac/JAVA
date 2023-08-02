/* 
 * 문제
 * 성별을 입력받은 후, 남인지 여인지를 출력하시오.
 * 
 * 입력>>
 * 성별 1 또는 2를 입력하세요 >>>
 * 
 * 출력>>
 * 남자/여자 입니다.
 * 잘못된 값 입니다.
*/

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 1 또는 2 를 입력하세요.");
		int gender = sc.nextInt();

		if (gender == 1) {
			System.out.println("남자 입니다.");
		} else if (gender == 2) {
			System.out.println("여자 입니다.");
		} else {
			System.out.println("잘못된 값 입니다.");
		}

		sc.close();
	}

}
