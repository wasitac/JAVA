package method.reference;

import java.util.function.Consumer;

public class Ex04 {
	public static void main(String[] args) {
		// 출력 메서드 : System.out.println()
		// - 인수 1개, 리턴형 void
		// - Consumer
		
		// [메서드 참조 표현식]
		Consumer<String> reference = System.out::println;
		reference.accept("yaho");
	}
}
