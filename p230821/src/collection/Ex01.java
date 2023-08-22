package collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * [컬렉션] collection
 * : 자료구조(data) + 알고리즘
 * : field + method
 * : 데이터를 묶어서 관리 및 사용을 쉽게 하기 위한 구조
 * 
 * [컬렉션 프레임워크] collection framework
 * : 컬렉션 클래스와 인터페이스의 집합
 * : 프로그래밍 편리성, 통합된 API 구조로 인한 효율성 증대
 * 
 * --------------------------------------------------------------------------------------
 * 								순서   | 중복 허용		| 구현 클래스
 * --------------------------------------------------------------------------------------
 * Collection<E>	List<E>		o		o			| ArrayList, LinkedList, Stack, Queue
 * 					Set<E>		x		x			| HashSet, TreeSet
 * 
 * Map<K, V>					x		k=x, v=o	| HashMap, TreeMap
 */

public class Ex01 {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> arrayList = new ArrayList<String>();

		// 저장된 요소 존재 여부
		System.out.println("비어있나요? >> " + arrayList.isEmpty());

		// 요소 개수
		System.out.println("[요소 추가 전] 저장된 요소 개수 >> " + arrayList.size());

		// 요소 추가
		arrayList.add("하나");
		arrayList.add("둘");
		arrayList.add("셋");
		arrayList.add("넷");

		System.out.println("[요소 추가 후] 저장된 요소 개수 >> " + arrayList.size());

		// 특정 위치에 저장된 요소 접근
		System.out.println("인덱스 0 " + arrayList.get(0));
		System.out.println("인덱스 2 " + arrayList.get(2));

		// 특정 객체 포함 여부 확인
		System.out.println("둘 있나요? >> " + arrayList.contains("둘"));

		// [저장된 요소 전체 출력 1] for문 -----------------------------------
		System.out.println("<< 요소 전체 출력 1 : for >>");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println(arrayList.toString());

		// [저장된 요소 전체 출력 2] 향상된 for문 ------------------------------
		System.out.println("<< 요소 전체 출력 2 : 향상된 for >>");
		for (String string : arrayList) {
			System.out.println(string);
		}

		// [저장된 요소 전체 출력 3] toArray() ------------------------------
		System.out.println("<< 요소 전체 출력 3 : toArray()");
		System.out.println(arrayList.toArray());

		// [저장된 요소 전체 출력 4] iterator() ------------------------------
		System.out.println("<< 요소 전체 출력 4 : iterator()");
		System.out.println(arrayList.iterator());

		// iterator 내부 코드 보고와요
		Iterator<String> iter = arrayList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("다시 출력 1");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// iterator는 일회용. 또 쓰려면 또 만들어야함
		System.out.println("다시 출력 2");
		iter = arrayList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 특정 객체가 요소와 같은지 비교
		arrayList.get(0).equals("셋");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("[셋]과 같나요?" + arrayList.get(i).equals("셋"));
		}

		// 특정 요소 변경
		System.out.println("셋 -> 여섯 변경");
		String oldValue = arrayList.set(2, "여섯");
		System.out.println("oldValue : " + oldValue);
		System.out.println(arrayList);

		// 특정 요소 삭제
		System.out.println("<< 요소 [둘] 삭제 >>");
		arrayList.remove("둘");
//		arrayList.remove(1);
		System.out.println(arrayList);
		for (int j = 0; j < arrayList.size(); j++) {
			System.out.printf("인덱스 %d 의 값 %s\n", j, arrayList.get(j));
		}

		// 요소 개수
		System.out.println("요소 개수 >> " + arrayList.size());

		// 인덱스 1에 저장된 요소
		System.out.println("인덱스 1에 저장된 요소 >> " + arrayList.get(1));

		// 요소 추가 : 중복 요소 - 하나
		arrayList.add("하나");
		System.out.println(arrayList);

		// 요소 추가 : 특정 위치 - 인덱스 1의 위치에 추가
		arrayList.add(1, "아홉");
		System.out.println(arrayList);

		System.out.println("저장된 요소 개수 >> " + arrayList.size());

		// 모든 요소 삭제
		arrayList.clear();
		System.out.println("모든 요소 삭제 후 - 개수" + arrayList.size());
	}

}
