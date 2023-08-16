package exception;

public class Ex04 {
	public static void arrayShow(int[] arr) {
		System.out.println("arrayShow() --- 실행 시작");
		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 : 예외발생!!!");
		} catch (ArithmeticException e) {
			System.err.println("계산 불능 : 예외 발생!!");
		} catch(Exception e){
		System.err.println("예외예외 발생!!");
		} finally {
			System.out.println("try 구문 마지막에 무조건 실행");
		}

	}

	public static void main(String[] args) {
		System.out.println("main() >>> Start");
		int[] arr = { 1, 3, 5 };
		arrayShow(arr);
		System.out.println("main() >>> End");
	}

}
