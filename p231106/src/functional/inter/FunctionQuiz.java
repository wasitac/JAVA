package functional.inter;

@FunctionalInterface
interface Box {
	int boxing(int num);
	
	// [문제] 익명 클래스로 구현
	default Box compose(Box before) {
		return new Box() {
			@Override
			public int boxing(int num) {
				return boxing(before.boxing(num));
			}
		};
	}
	// [람다] lambda
	default Box composeLambda(Box before) {
		return (int num) -> boxing(before.boxing(num));
	}
}

public class FunctionQuiz {

	public static void main(String[] args) {
		Box power = num -> num * num;
		System.out.println("제곱 >> " + power.boxing(5));
		
		Box increment = num -> num + 1;
		System.out.println("1증가 >> " + increment.boxing(5));
		
		// << 1증가 후 제곱 >>
		System.out.println(power.compose(increment).boxing(5));
	}

}
