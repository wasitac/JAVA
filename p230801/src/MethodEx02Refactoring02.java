/*
 * [메서드 정의]
 * 특정 코드가 비연속으로 반복
 * 
 * [메서드 리팩토링]
 * 단축키 : 블록 지정 후, alt + shift + m
 */
import java.util.Scanner;

public class MethodEx02Refactoring02 {
	
	public static void main(String[] args) {
		int num = 5;

		increment(num);
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 1개 입력 >> ");
		int userNumber = input.nextInt();
		input.close();
		
		increment(userNumber);
		
		int var = 10;
		
		increment(var);
		
	}

	public static void increment(int arg) {
		arg++;
		System.out.println(arg);
	}

}
