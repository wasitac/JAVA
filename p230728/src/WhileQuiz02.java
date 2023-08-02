import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
/*
 * [문제]
 * 사용자에게 1~10 사이의 정수 1개를 입력 받고
 * 랜덤값 생성을 사용자가 입력한 정수에서 멈춤
 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~10 사이의 정수를 1개 입력하세요 >>> ");
		int num = scanner.nextInt();
		int ranNum = 0;
		int count = 0;
		
		do {
			count++;
			ranNum = (int)(Math.random() * 10) + 1;
			System.out.printf("%d ", ranNum);
		} while(num != ranNum);
		
		System.out.printf("\n%d회 실행해서 찾았다!", count);
		
		scanner.close();
	}

}
