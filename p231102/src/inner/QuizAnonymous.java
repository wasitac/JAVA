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

		ArrayList<Person> arrayList = new ArrayList<>(hashSet);
		

		// [문제] 이름을 기준으로 정렬
		Comparator<Person> comparator = new Comparator<>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

//		Comparator<Person> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		
//		for (int j = 0; j < arrayList.size(); j++) {
//			int cnt = 0;
//			for (int i = 0; i < arrayList.size() - 1; i++) {
//				if (0 < comparator.compare(arrayList.get(i).getName(), arrayList.get(i + 1).getName())) {
//					// 교체
//					Person small = arrayList.get(i + 1);
//					arrayList.remove(small);
//					arrayList.add(i, small);
//					cnt++;
//				}
//			}
//			if (cnt == 0)
//				break;
//		}
		arrayList.sort(comparator);
		for (Iterator<Person> iterator = arrayList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next().getName());
		}

	}
}