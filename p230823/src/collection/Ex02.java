package collection;

import java.util.HashSet;
import java.util.Iterator;

class Person {
	// feild
	private String name;
	private int age;

	// constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 이름이 같은 인스턴스 추가 안되게 오버라이딩하기
	@Override
	public int hashCode() {
		// return this.name.hashCode() + this.age;
		return (this.name + this.age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && (age == p.age);
		}
//		return this.hashCode() == obj.hashCode();
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);

		HashSet<Person> hashSet = new HashSet<>();
		hashSet.add(hong);
		hashSet.add(park);
		hashSet.add(new Person("이미자", 52));
		System.out.println(hashSet);

		Iterator<Person> iter = hashSet.iterator();
		while (iter.hasNext())
			System.out.println(iter.next().getName());

		// 요소추가
		hashSet.add(new Person("박보검", 35));
		System.out.println("박보검 요소 추가 후");
		iter = hashSet.iterator();
		while (iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p.getName() + ", " + p);
		}

		System.out.println("<< hashCode() >>");
		System.out.println("hong >> " + hong.hashCode());
		System.out.println("park >> " + park.hashCode());
		System.out.println("새 박보검 >> " + new Person("박보검", 35));
	}

}
