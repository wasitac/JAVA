package functionalInterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerEx02 {
	public static void main(String[] args) {
		//--------------------------------------
		// 문자열.split() : 특정 문자 기준으로 나누기
		//--------------------------------------
		
		// 공백 기준으로 문자열 나누기
		System.out.println("문자열 나누기 작업 중".split(" "));
		
		// 배열에 저장
		// 1. 공백 기준 : 문자열 모두 나누기
		String[] s = "문자열 나누기 작업 중".split(" ");
		System.out.println(s);
		System.out.println("s >> " + Arrays.toString(s));
		System.out.println("인덱스 0 >> " + s[0]);
		
		// 2.공백 기준 : 문자열 2개로 나누기
		String[] s2 = "문자열 나누기 작업 중".split(" ", 2);
		System.out.println(s2);
		System.out.println("s2 >> " + Arrays.toString(s2));
		
		// 3.공백 기준 : 문자열 3개로 나누기
		String[] s3 = "문자열 나누기 작업 중".split(" ", 3);
		System.out.println(s3);
		System.out.println("s3 >> " + Arrays.toString(s3));

		// 3.공백 기준 : 문자열 3개로 나누기
		String[] s4 = "문자열 나누기 작업 중".split(" ", 10);
		System.out.println(s4);
		System.out.println("s4 >> " + Arrays.toString(s4));
		
		
		// [문제] 문자열을 인수로 입력 받은 후, 공백 기준으로 두 번째 문자열 출력
		Consumer<String> getSecondWord = t -> {
				String[] s5 = t.split(" ", 3);
				System.out.println(s5[1]);
		};
		
		getSecondWord.accept("오늘도 즐거운 하루");
	}
}
