package collection;

import java.util.ArrayList;

class Person {
	// field
	private String name;
	private int age;

	// 필요한 멤버 추가 ------------------------
	// constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// ------------------------------------
}

public class ArrayListQuiz {
	public static void main(String[] args) {
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		Person lee = new Person("이미자", 52);

		// [문제] ArrayList에 hong, park, lee를 저장(요소 추가)하시오.
		ArrayList<Person> p = new ArrayList<>();
		p.add(hong);
		p.add(park);
		p.add(lee);

		System.out.println("<< 저장된 이름 전체 출력 >>");
		for (Person person : p) {
			System.out.println(person.getName());
		}
		
		for (Object person : p.toArray()) {
			System.out.println(((Person)person).getName());
		}
		
		System.out.println();
		System.out.println();

		System.out.println("<< 저장된 전체 요소 개수 >>"); 
		System.out.println(p.size());
		System.out.println(); 

		System.out.println("<< 인덱스 1의 이름 >>");
		System.out.println(p.get(1).getName());
		System.out.println();

		System.out.println("<< 35세 박보검 포함 여부 >>");// park
		System.out.print("박보검 있나요? >> ");
		System.out.println(p.contains(park));
		System.out.println();

		System.out.println("<< 52세 이미자 포함 여부 >>");// new Person("이미자", 52)
		System.out.print("이미자 확인 되나요? >> ");

		System.out.println(p.contains(new Person("이미자", 52)));
		System.out.println(lee.equals(new Person("이미자", 52)));

		System.out.println();

		System.out.println("<< 홍길동 이름을 화이팅으로 변경 >>");
//		p.get(0).setName("화이팅");
		
		for(int i = 0; i < p.size(); i++) {
			if (p.get(i).getName().equals("홍길동")) {
				p.get(i).setName("화이팅");
			}
		}
		
		for(Person person : p) {
			if(person.equals(hong)) {
			person.setName("화이팅22");
			}
		}
		
		for (Person person : p) {
			System.out.println(person.getName());
		}

	}
}
