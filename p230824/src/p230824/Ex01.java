package p230824;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		String[] arr = new String[] { "하나", "둘", "셋" };

		// shallow copy : 얕은 복사
		String[] shallowCopy = arr;
		System.out.println("shallowCopy  >> " + Arrays.toString(shallowCopy));

		// deep copy : 깊은 복사
		String[] deepCopy = Arrays.copyOf(arr, 3);
		System.out.println("deepCopy >> " + Arrays.toString(deepCopy));
		
		System.out.println("\n=== 요소 변경 후 : 둘 -> two ===");
		arr[1] = "two";
		System.out.println("[원본] arr >> " + Arrays.toString(arr));
		System.out.println("shallowCopy  >> " + Arrays.toString(shallowCopy));
		System.out.println("deepCopy >> " + Arrays.toString(deepCopy));
	}

}
