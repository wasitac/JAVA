package book;

public class AnimalInfo {
	// field
	private String name;
	private int age;

	// constructor
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// method
	public void showAmimalInfo() {
		System.out.println("name >> " + this.name);
		System.out.println("age >> " + this.age);
		System.out.println();
	}
}
