package collection;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {

	public static void main(String[] args) {
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		
		// 다형성
		Map<Object, Person> hashMap = new HashMap<>();
		//객체의 필드로 객체를 가리켜 hashMap에 저장
		hashMap.put(hong.getName(), hong);
		hashMap.put(park.getName(), park);
		
		HashMap<Integer, Person> hash = new HashMap<Integer, Person>();
		hash.put(1, hong);
		hash.put(2, park);
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", hong.getName());
		map.put("age", hong.getAge());
		map.
		System.out.println(hashMap);
	}

}
