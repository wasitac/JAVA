package functionalInterface;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// ------------------------------------------------------------
		// Predicate<T> : 매개변수 있음 (1개, T), 반환값 있음(boolean)
		// boolean test(T t)
		Predicate<Integer> positive = s -> s >= 0;
		System.out.println("1은 양수인가요? " + positive.test(1));
		System.out.println("-1은 양수인가요? " + positive.test(-1));
	}

}
