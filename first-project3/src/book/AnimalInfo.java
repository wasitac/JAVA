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

	public int getAge() {
		return age;
	}

	// method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showAmimalInfo() {
		System.out.println("name >> " + this.name);
		System.out.println("age >> " + this.age);
		System.out.println();
	}

}
