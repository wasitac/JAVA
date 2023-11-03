package lambda;

@FunctionalInterface
interface MaxReturn {
	// abstract method
	public int max(int n1, int n2);

	// default method
	default void method(int n1, int n2) {
		System.out.printf("매개변수 값 n1 : %d\n", n1);
	}
}

public class QuizLambda01 {
	public static MaxReturn setMax(MaxReturn maxReturn) {
		return maxReturn;
	};

	public static void main(String[] args) {
		// [문제 1] 익명 클래스 : 참조변수에 저장 max메서드를 호출하면 큰 값을 리턴 후 출력
		MaxReturn printMax = new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				return n1 > n2 ? n1 : n2;
			}
		};

		System.out.println(printMax.max(2, 4));

		// [문제 2] 익명 클래스 : 인수
		System.out.println(new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				return n1 > n2 ? n1 : n2;
			};
		}.max(1, 4));

		// [문제 3] 문제 1을 람다로 표현
		MaxReturn printMax2 = (int n1, int n2) -> n1 > n2 ? n1 : n2;
		System.out.println(printMax2.max(6, 4));

		// [문제 4] 문제 2를 람다로 표현
		System.out.println(setMax((int n1, int n2) -> n1 > n2 ? n1 : n2).max(4, 9));
	}
}
