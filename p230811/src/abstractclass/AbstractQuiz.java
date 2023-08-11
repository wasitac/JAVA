package abstractclass;

abstract class Animal {
	// field
	String name;

	// constructor
	public Animal() {
		this.name = "미입력";
	}

	public Animal(String name) {
		this.name = name;
	}

	// method
	abstract void play();
}

class Cat extends Animal {
	// constructor
	public Cat(String name) {
		super(name);
	}
	@Override
	void play() {
		System.out.println(super.name + "는 낚싯대 놀이 중입니다.");
	}
}

class Dog extends Animal {
	// constructor
	public Dog(String name) {
		super(name);
	}

	@Override
	void play() {
		System.out.println(super.name + "는 터그 놀이 중입니다.");
	}
}

public class AbstractQuiz {

	public static void main(String[] args) {
		Dog roy = new Dog("로이");
		Cat bear = new Cat("베어");
		
		animalPlay(roy);
		animalPlay(bear);
	}
	
	// animalPlay() 정의 ==========================
	// : animalPlay() 메서드 내에서 play() 호출
	// [출력형태]
	// Dog class의 play() : 로이는 터그 놀이 중입니다.
	// Cat class의 play() : 베어는 낚싯대 놀이 중입니다.
	
	public static void animalPlay(Animal animal) {
		animal.play();
	}

}
