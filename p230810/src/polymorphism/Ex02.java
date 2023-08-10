package polymorphism;

class Fruit {
	@Override
	public String toString() {
		return "[Fruit] 나는 과일이다";
	}
}

class Person {
	@Override
	public String toString() {
		return "[Person] 저는 사람입니다.";
	}
}

public class Ex02 {
	
	public static void printInfo(Object object) {
		System.out.println(object);
		System.out.println("======================");
	}
	
	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Person person = new Person();
		
		printInfo(fruit);
		printInfo(person);
	}

}
