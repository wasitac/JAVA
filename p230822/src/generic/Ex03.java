package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> arrayList = new ArrayList<>();
		
		// 요소 추가
		arrayList.add("하나");
		arrayList.add("둘");
		arrayList.add("셋");
		arrayList.add("넷");

		System.out.println(arrayList);
		
		// 배열 복사
		// 1. shallow copy : 얕은 복사
		Object copyObject = arrayList.clone();
		System.out.println("<< 얕은 복사 >>");
		System.out.println(copyObject);
		
		// arrayList의 둘을 two로 변경
		// 얕은복사라면서요...
		arrayList.set(1,  "two");
		System.out.println(arrayList);
		System.out.println(copyObject);

		// 2. deep copy 
		Object[] copyList = arrayList.toArray();
		System.out.println(Arrays.toString(copyList));
		
		// arrayList의 요소 중 'two'.을 '투'로 변경
		arrayList.set(1, "투");
		System.out.println("arrayList >> " + arrayList);
		System.out.println("copyList >> " + Arrays.toString(copyList));
		
		
	}
}
