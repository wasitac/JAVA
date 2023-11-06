package method.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {			
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class MethodReferenceQuiz {
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}
	
	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();
		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));
		
		// [문제 1] 정의한 forEach문 사용
		// [문제 1-1] 이름과 나이를 출력 : toString()
		Consumer<Person> consumer = new Consumer<Person>() {
			@Override
			public void accept(Person t) {
				System.out.println(t.toString());
			}
		};
		forEach(person, consumer);
		
		// [람다]
		System.out.println("람다");
		forEach(person, t -> System.out.println(t.toString()));
		
		// [메서드 참조]
		System.out.println("메서드 참조");
		forEach(person, consumer::accept);

		// [문제 1-2] 이름만 출력 : getName()
		Consumer<Person> consumeName = new Consumer<Person>() {
			@Override
			public void accept(Person t) {
				System.out.println(t.getName()); 
			}
		};
		forEach(person, consumeName);
		
		// [람다]
		forEach(person, t -> System.out.println(t.getName()));
		// [메서드 참조]
		
		
		// [문제 2] ArrayList의 forEach문 사용
		// [문제 2-1] 이름과 나이를 출력 : toString()
		// [람다]
		// [메서드 참조]
		
		// [문제 2-2] 이름만 출력 : getName()
		// [람다]
		// [메서드 참조]
		

	}
}
