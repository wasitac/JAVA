import java.util.Scanner;

public class IfQuiz03Refactoring {

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


//public class IfQuizRefactoring {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		
//		int score = sc.nextInt();
//		char plus = '0';
//		char grade = '\0';
//		int ten = score / 10;
//		int one = score % 10;
//		
//		if ((one >= 7) || (score==100))
//			plus = '+';
//		else if (one <= 3)
//			plus = '-';
//
//		if(ten == 10)
//			ten--;
//		else if(ten < 7) {
//			ten = 4;
//			plus = '\0';
//		}
//		
//		//90점 이상일 때 65를 값으로 가지고 70점 미만일 때 70을 값으로 가지는 char변수
//		grade = (char)(74 - ten);
//
//		System.out.printf("학점은 %c%c", grade, plus);
//		sc.close();
//	}
//		
//}