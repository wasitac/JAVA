/*
 * [메서드 정의]
 * 특정 코드가 비연속으로 반복
 */
import java.util.Scanner;

public class MethodEx02 {
	
	public static void main(String[] args) {
		int num = 5;
		num++;
		System.out.println(num);
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 1개 입력 >> ");
		int userNumber = input.nextInt();
		input.close();
		
		userNumber++;
		System.out.println(userNumber);
		
		int var = 10;
		
		var++;
		System.out.println(var);
		
	}

}
