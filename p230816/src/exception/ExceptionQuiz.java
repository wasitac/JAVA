package exception;

public class ExceptionQuiz {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("interrupted");
			}

		}
	}

}
