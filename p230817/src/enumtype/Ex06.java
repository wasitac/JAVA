package enumtype;

enum Animal {
	DOG("해피"), CAT("누리", 5);
	
	String name;
	int age;
	
	private Animal() {}
	
	private Animal(String name) {
		this.name = (name);
	}
	
	private Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("이름 >> " + this.name);
		System.out.println("나이 >> " + this.age);
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Animal.DOG.show();
		Animal.CAT.show();
	}

}
