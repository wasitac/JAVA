package exception;

public class Ex05 {
	public static void arrayShow(int[] arr) throws IndexOutOfBoundsException, Exception {
		System.out.println("arrayShow() --- 실행 시작");
		System.out.println(arr[4]);
		System.out.println(5 / 0);
		System.out.println("arrayShow() --- 실행 종료");
	}

	public static void main(String[] args) {
		System.out.println("main() >>> Start");
		int[] arr = { 1, 3, 5 };

		try {
			arrayShow(arr);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("[main method] 예외 처리됨");
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("main() >>> End");
	}

}
