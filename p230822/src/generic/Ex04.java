package generic;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex04 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println("비어있나요? >> " + linkedList.isEmpty());
		
		// 요소 추가
		linkedList.add("하나");
		linkedList.add("둘");
		linkedList.add("셋");
		linkedList.add("셋");

		System.out.println("비어있나요? >> " + linkedList.isEmpty());		
		System.out.println("저장된 요소 개수 >> " + linkedList.size());
		
		System.out.println("요소 모두 출력 >> " + linkedList);
		
		System.out.println("둘 있나요? >> " + linkedList.contains("둘"));
		System.out.println("넷 있나요? >> " + linkedList.contains("넷"));
		
		// 저장된 요소 모두 출력
		System.out.println("<< 전체 요소 >>");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));			
		}
		
		System.out.println("<< 전체 요소 출력 2 >>");
		for  (Object obj : linkedList.toArray())
			System.out.println(obj);

		System.out.println("<< 전체 요소 출력 3 >>");
		//자료형이 인터페이스?                  //리턴형이 인터페이스
		Iterator<String> iter = linkedList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 특정 요소 변경
		System.out.println("셋 -> 여섯");
//		linkedList.set(2, "여섯");
		//셋이 두개인데?
		linkedList.set(linkedList.indexOf("셋"), "여섯");
		System.out.println(linkedList);
		
		// 특정 요소의 인덱스
		int index = linkedList.indexOf("여섯");
		System.out.println("요소 여섯의 인덱스 >> " + index);
		
		// 특정 요소 삭제
		System.out.println("요소 둘 삭제");
		linkedList.remove("둘");
		System.out.println(linkedList);
		System.out.println("저장된 요소 개수 >> " + linkedList.size());
		
		// 특정 위치에 추가
		System.out.println("인덱스 1의 자리에 요소 다섯 추가");
		linkedList.add(linkedList.indexOf("여섯"), "다섯");
		System.out.println(linkedList);
		
		// 전체 요소 삭제
		System.out.println("\n<< 전체 요소 삭제 후 >>");
		linkedList.clear();
		System.out.println(linkedList);
	}
}