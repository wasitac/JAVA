package book;

public class AnimalInfo {
	private String name;
	private int age;
	
	// constructor
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// method
	public void showAnimalInfo() {
		System.out.println("name >> " + this.name);
		System.out.println("age >> " + this.age);
		System.out.println();
	}

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}