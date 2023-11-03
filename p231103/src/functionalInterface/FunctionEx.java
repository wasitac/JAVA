package functionalInterface;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		// -------------------------------------------------
		// Function<T, R> : 매개변수 1개(T), 반환값 있음(R)
		// Function<매개변수 타입, 반환 타입>
		// R apply(T t)
		// -------------------------------------------------

		// [익명 클래스] anonymous class -----------------------
		Function<Integer, String> anonymous = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return "[익명 클래스] 매개변수 값은 " + t + "입니다.";
			}
		};
		
		System.out.println(anonymous.apply(100));
		// [람다] lambda express -----------------------------
		Function<Integer, String> lambda = t -> "[람다] 매개변수 값은 " + t + "입니다.";
		System.out.println(lambda.apply(200));
	}

}
