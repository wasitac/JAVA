import java.util.Scanner;

public class SwitchQuiz01 {
	public static void main(String[] args) {
		/*
		 * 문제
		 * 월을 입력 받은 후, 계절을 출력하시오
		 * 
		 * 입력형태
		 * 현재 월을 입력하세요
		 * 
		 * 출력형태
		 * 현재 계절은 여름입니다.
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요 >>>");
		int month = scanner.nextInt();
		
		String season = "봄";
		
		switch (month) {
		case 6, 7, 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;

		}
		System.out.println("현재 계절은 " + season + "입니다.");
	
		scanner.close();
	}

}