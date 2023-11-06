package method.reference;

import java.util.function.Function;

@FunctionalInterface
interface Greeting {
	int say(String str);
}

public class Ex05 {
	public static void main(String[] args) {
		// 출력 메서드 : String class length() method
		// - 인수 1개, 리턴형 int
		// - Greeting
		
		// [메서드 참조]
		// 문자열의 길이
		Greeting reference = String::length;
		System.out.println(reference.say("yaho"));
		
		// [Functional Interface]
		Function<String, Integer> functional = String::length;
		System.out.println(functional.apply("ya ho"));
	}
}
