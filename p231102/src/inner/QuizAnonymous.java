package inner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이: %d\n", name, age);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class QuizAnonymous {

	public static void main(String[] args) {
		HashSet<Person> hashSet = new HashSet<>();
		hashSet.add(new Person("홍길동", 29));
		hashSet.add(new Person("박보검", 35));
		hashSet.add(new Person("이미자", 52));
		hashSet.add(new Person("ㄹ", 52));
		hashSet.add(new Person("ㅍ", 52));
		hashSet.add(new Person("ㄷ", 52));
		hashSet.add(new Person("ㄴ", 52));
		hashSet.add(new Person("ㅋ", 52));

		ArrayList<Person> arrayList = new ArrayList<>();
		arrayList.addAll(hashSet);
//		Iterator<Person> iter = hashSet.iterator();
//		while (iter.hasNext()) {
//			arrayList.add(iter.next());
//		}
		
		// [문제] 이름을 기준으로 정렬
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		
		for(int i = 0; i<arrayList.size()-i; i++) {
			if(0 < comparator.compare(arrayList.get(i).getName(), arrayList.get(i+1).getName())) {
				//교체
				System.out.println("..."+arrayList.get(i).getName());
				Person small = arrayList.get(i+1);
				arrayList.remove(small);
				arrayList.add(i, small);
			};
		}
		
		for (Iterator<Person> iterator = arrayList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next().getName());
		}
		
		
	}
}
