package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class QuizPredicate {

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<T>();
		
		for (T t : list) {
			if (predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));

		// 전체 데이터 출력
		for (Person p : person) {
			System.out.println(p.getName());
		}

		// 나이가 30세 이상인 사람의 이름 출력
		// [익명 클래스] anonymous class
		List<Person> result = filter(person, new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getAge() >= 30;
			}
		});
		
		for (Person p : result) {
			System.out.println("[익명] " + p.getName());
		}

		// [람다] Lambda express
		List<Person> result2 = filter(person, t -> t.getAge() >= 30);
		
		for (Person p : result2) {
			System.out.println("[람다] " + p.getName());
		}
	}

}
