package collection;

import java.net.Socket;
import java.util.HashMap;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex03 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		// 요소 개수
		System.out.println("[요소 추가 전] 개수 >> " + hashMap.size());
		
		// 요소 추가
		hashMap.put("하나", 1);
		hashMap.put("둘", 2);
		hashMap.put("셋", 3);
		//중복 key
		hashMap.put("하나", 111);
		System.out.println("[요소 추가 후] 개수 >> " + hashMap.size());
		
		// 저장된 전체 요소 출력
		// 순서를 보장하지 않습니다
		System.out.println(hashMap.toString());
		
		// 저장된 키들의 집합 : 키만 추출
		System.out.println();
		System.out.println("<< 저장된 모든 키 추출 >>");
		System.out.println(hashMap.keySet());
		
		// 저장된 값들의 집합 : 값만 추출
		System.out.println();
		System.out.println("<< 저장된 모든 값 추출 >>");
		System.out.println(hashMap.values());
		
		// 키를 통한 값 추출 : 특정 키의 값
		System.out.println("<< 키가 '하나'인 요소의 값 >>" + hashMap.get("하나"));
		
		// 키를 통한 값 변경
		// replace와 put의 차이?
		hashMap.replace("하나", 100);
		System.out.println("\n<< 키가 '하나'인 요소의 값을 100으로 변경 후 >>");
		System.out.println(hashMap);
		
		// 키를 통한 특정 요소 삭제
		hashMap.remove("하나");
		System.out.println("\n<< 키가 '하나'인 요소 삭제 후");
		System.out.println(hashMap);
		
	}

}


