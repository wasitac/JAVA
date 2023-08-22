package generic;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// [배열 복사] ==================='
		// 길이가 3인 배열 생성
		String[] str = new String[3];
		str[0] = "one";
		str[1] = "two";
		str[2] = "three";
		//str[3] = "four";
		
		for(String s : str)
			System.out.println(s);
		
		// 2. 배열 복사
		// 2-1. shallow copy : 얕은 복사
		String[] shallowCopy = str;
		
		shallowCopy[1] = "둘";
		
		System.out.println("<< 배열 복사 후 인덱스 1의 요소를 둘 변경 >>");
		System.out.println("[shallowCopy]");
		for(String s : shallowCopy)
			System.out.println(s);
		
		System.out.println("[str]");
		for(String s : str)
			System.out.println(s);
		
		// 2-2. deep copy : 깊은 복사
		String[] deepCopy = Arrays.copyOf(str, str.length);
		System.out.println("깊은 복사 후 >>");
		System.out.println(Arrays.toString(deepCopy));
		
		// 인덱스 1의 요소를 ten으로 변경
		System.out.println("<< 배열 복사 후 인덱스 1의 요소를 ten 변경 >>");
		deepCopy[1] = "ten";
		System.out.println("[deepCopy]");
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("[str]");
		System.out.println(Arrays.toString(str));
		
		
	}
}
