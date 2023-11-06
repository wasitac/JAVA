package functionalInterface;

import java.util.function.Function;

public class QuizFunction {

	public static void main(String[] args) {
		// [문제] 문자열 1개를 입력 받은 후, 문자열의 길이 리턴
		Function<String, Integer> lengthOfString = t -> t.length();
//		Function<String, Integer> lengthOfString = new Function<String, Integer>() {
//			@Override
//			public Integer apply(String t) {
//				return t.length();
//			}
//		};
		System.out.println("문자열의 길이 >>" + lengthOfString.apply("asdfasdf"));
		
		// [문제] 정수 1개를 인수로 받은 후, 제곱한 값을 리턴
		Function<Integer, Integer> square = i -> i*i;
//		Function<Integer, Integer> square = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return t*t;
//			}
//		};
		System.out.println("제곱 >> " + square.apply(5));
		
		// [문제] 정수 1개를 인수로 받은 후, 1증가한 값을 리턴
		Function<Integer, Integer> plusOne = i -> ++i;
//		Function<Integer, Integer> plusOne = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return ++t;
//			}
//		};
		System.out.println("더하기1 >> " + plusOne.apply(5));
		System.out.println(square.andThen(plusOne).apply(5));
		System.out.println(square.compose(plusOne).apply(5));
		
		System.out.println(Function.identity().apply("즐거운 인생"));
		
	}

}
