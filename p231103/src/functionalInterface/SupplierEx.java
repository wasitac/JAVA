package functionalInterface;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		// ----------------------------------
		// Supplier : 매개변수 없음, 반환값 있음(T)
		// boolean test(T t)
		// ----------------------------------
		
		// [익명 클래스] anonymous class
		Supplier<String> anonymous = new Supplier<String>() {
			
			@Override
			public String get() {
				return "[익명 클래스] 신기한 함수형 인터페이스";
			}
		};
		System.out.println(anonymous.get());
		
		// [람다] lambda express
		Supplier<String> lambda = () -> "[람다] 신기한 함수형 인터페이스";
		System.out.println(lambda.get());
	}

}
