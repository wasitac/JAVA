package method.reference;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06 {
	public static void main(String[] args) {
		String[] arr = {"A", "c", "E", "d", "b"};
		
		// 오름차순 정렬, 대소문자 구분
		Arrays.sort(arr);
		System.out.println("[정렬 후]" + Arrays.toString(arr));
		
		// 정렬 : 오름차순 정렬, 대소문자 구분 없음
		Arrays.sort(arr, String::compareToIgnoreCase);
		System.out.println("[대소문자 구분없음 정렬 후]" + Arrays.toString(arr));
	}
}
