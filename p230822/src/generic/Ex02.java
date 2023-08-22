package generic;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "하나";
		str[1] = "둘";
		str[2] = "셋";
		
		System.out.println("str의 길이 >> " + str.length);
		System.out.println("str에 저장된 요소 " + Arrays.toString(str));
		
		// [배열의 길이를 증가] ================
		// 1.새 배열을 생성
		String[] newArr = new String[10];
		
		// 2.요소 복사 : str에 저장된 주소를 newArr에 복사
		for (int i = 0; i < str.length; i++)
			newArr[i] = str[i];
		
		// 3. str에 newArr의 주소 저장
		str = newArr;
		System.out.println("str의 길이 >> " + str.length);
		System.out.println("str에 저장된 요소 " + Arrays.toString(str));
		
		// 4. 다 헛수고로 만들어주는 마법
		str = Arrays.copyOf(str, 20);
		System.out.println("str의 길이 >> " + str.length);
		System.out.println("str에 저장된 요소 " + Arrays.toString(str));
		
	}
}
