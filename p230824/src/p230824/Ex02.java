package p230824;

import java.util.ArrayList;
import java.util.Arrays;

class Person implements Cloneable {
	private String name;
	private int age;


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Person)super.clone();
	}
}

public class Ex02 {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		Person lee = new Person("이미자", 52);
		
		ArrayList<Person> array = new ArrayList<Person>();
		
		array.add(hong);
		array.add(park);
		array.add(lee);
		
		System.out.println(array);
		
		//[shallow copy : 얕은 복사] =========================================
		Object shallowCopy = array.clone();
		System.out.println("shallowcopy >> " + shallowCopy);

		// [deep copy : 깊은 복사] ===========================================
//		Object[] deepCopy = array.toArray();
		ArrayList<Person> deepCopy = new ArrayList<Person>();

			for (Person p : array) {
				deepCopy.add((Person)p.clone());
			}
		
		System.out.println("deepCopy >> " + deepCopy);
		
//		array.set(1, new Person("신입", 100));
		System.out.println(array);
		System.out.println(shallowCopy);
		
		array.get(1).setAge(70);
		
		System.out.println("[원본] array >> " + array);
		for (Person p : array) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		
		for (Person p2 : (ArrayList<Person>)shallowCopy) {
			System.out.println(p2.getName() + " " + p2.getAge());
		}
		
		System.out.println("deepCopy >> " + deepCopy);
		for(Object copy : deepCopy) {
			System.out.println(((Person)copy).getName() + " " + ((Person)copy).getAge());
		}
		
		
	}
}
