

class Dog{
	int age = 5;
	
	public void showAge() {
		System.out.println("나이 >> " + age);
	}
	
	public static void createInstance() {
		Dog dog = new Dog();
		dog.showAge();
	}
}

public class Ex02 {
	int num = 100;
	
	public static void main(String[] args) {
		Ex02 e = new Ex02();
		System.out.println(e.num);
		Dog.createInstance();
	}

}
