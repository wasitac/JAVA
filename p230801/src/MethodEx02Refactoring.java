
/*
 * [메서드 정의]
 * 특정 코드가 비연속으로 반복
 */
import java.util.Scanner;

public class MethodEx02Refactoring {
	public static int increment(int arg) {
		arg++;
		System.out.println(arg);
		return arg;
	}

	public static void main(String[] args) {
		int num = 5;
		num = increment(num);
		System.out.println("[main] increment(num) 실행 후 num >> " + num);

		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개 입력 >> ");
		int userNumber = input.nextInt();
		input.close();
		userNumber = increment(userNumber);
		System.out.println("[main] increment(userNumber) 실행 후 userNumber >> " + userNumber);

		int var = 10;
		var = increment(var);
		System.out.println("[main] increment(var) 실행 후 var >> " + var);
	}

}
