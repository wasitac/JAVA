import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// 
		int num = 5;
		System.out.println(num);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 한개를 입력하세요");
		num = scanner.nextInt();
		System.out.println(num);
		scanner.close();
	}

}
