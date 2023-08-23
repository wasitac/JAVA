package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		
		// 저장된 요소 존재 여부
		System.out.println("비어있나요? >> " + hashSet.isEmpty());

		// 요소 추가
		hashSet.add("하나");
		hashSet.add("둘");
		hashSet.add("셋");
		hashSet.add("하나");
		
		// 저장된 요소 존재 여부
		System.out.println("비어있나요? >> " + hashSet.isEmpty());
		
		// 요소 개수
		System.out.println("저장된 요소 개수 >> " + hashSet.size());
		
		System.out.println("hashSet >> " + hashSet);
		
		// 객체 포함 여부
		System.out.println("둘 있나요? " + hashSet.contains("둘"));
		System.out.println("둘 있나요? " + hashSet.contains("넷"));
		
		// 저장된 전체 요소 출력
		System.out.println("<< 전체 요소 출력 1 >>");
		
		System.out.println("<< 전체 요소 출력 2 >>");
		for(Object obj : hashSet.toArray())
			System.out.println(obj);
		
		System.out.println("<< 전체 요소 출력 3 >>");
		
		Iterator<String> iter = hashSet.iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}
		
		// return으로 추가 성공여부 돌려줌.
		/*
		 * HashSet은 요소를 추가하기 전에 이미 존재하는지 내부적으로 확인 절차 거침
		 * 1. 해당 요소의 hashCode() 호출하여 반환된 해쉬값으로 검색할 범위 결정
		 * 2. 해당 범위 내의 요소들을 equals() 비교
		 * 	  즉, HashSet에서 add()를 사용하여, 중복 없이 새 요소를 추가하기 위해
		 * 	  hashCode()와  equals()를 상황에 맞게 오버라이딩해야 함
		 */
		System.out.println("요소 추가 : 하나 >> " + hashSet.add("하나"));
		System.out.println("요소 추가 후 길이 >> " + hashSet.size());
		
		System.out.println("문자열 '하나'의 hashCode() >> " + "하나".hashCode());
		System.out.println("문자열 '하나'의 hashCode() >> " + "둘".hashCode());
		System.out.println("문자열 '하나'의 hashCode() >> " + "하나".hashCode());
	}

}
