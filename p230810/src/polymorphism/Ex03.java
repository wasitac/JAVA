package polymorphism;

class Animal {
	protected int leg;
	protected String name;

	public Animal() {
	}

	public Animal(int leg, String name) {
		this.leg = leg;
		this.name = name;
	}

}

class Cat extends Animal {
	public Cat(int leg, String name) {
		super(leg, name);
	}

	@Override
	public String toString() {
		return super.name;
	}
}

class Dog extends Animal {
	public Dog(int leg, String name) {
		super(leg, name);
	}

	@Override
	public String toString() {
		return super.name;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Cat mimi = new Cat(5, "미미");
		Dog hoya = new Dog(3, "호야");
		
		showInfo(mimi);
		showInfo(hoya);
	}
	
	public static void showInfo(Animal animal) {
		System.out.println(animal);
	}

}
