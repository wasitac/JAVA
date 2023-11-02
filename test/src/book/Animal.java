package book;

public class Animal {
	private Long id;
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showInfo() {
		System.out.printf("번호 : %d,  이름 : %s, 나이 : %d\n", this.id, this.name, this.age);
	}
}
