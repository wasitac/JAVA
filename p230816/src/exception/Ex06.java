package exception;

public class Ex06 {
	public static void arrayShow(int[] arr) throws IndexOutOfBoundsException {
		System.out.println("arrayShow() --- 실행 시작");
		System.out.println(arr[4]/0);
		System.out.println("arrayShow() --- 실행 종료");
	}

	public static void main(String[] args) throws IndexOutOfBoundsException {
		System.out.println("main() >>> Start");
			int[] arr = { 1, 3, 5 };
			arrayShow(arr);
		System.out.println("main() >>> End");
	}

}
