package functionalInterface;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// ----------------------------------
		// [Consumer] : 매개변수 T, 반환값 없음
		// void accept(T t)
		// ----------------------------------
		
		// [익명 클래스] anonymous class ==========
		Consumer<String> anonymous = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		anonymous.accept("[익명 클래스] 오늘도 즐거운 하 후 돈");
		
		// [람다] lambda express ================================
		Consumer<String> lambda = str -> System.out.println(str);
		lambda.accept("[람다] 오늘도 행복한 하루");
	}

}
