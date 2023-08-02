class Dog {
	int age;
	String name;

	// setter/getter
	// [단축키] alt + shift + s ->r

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class InstanceEx05 {

	public static void main(String[] args) {
		// 객체 생성
		Dog happy = new Dog();
		// 참조변수
		// 객체(인스턴스)명
		Dog sky = new Dog();

		happy.setAge(1);
		sky.setAge(10);

		System.out.println("happy의 나이 >> " + happy.getAge());
		System.out.println("sky의 나이 >> " + sky.getAge());

		Dog copy = happy;
		System.out.println("copy 나이 >> " + copy.getAge());
		
		copy.setName("해피");
		System.out.println("copy 이름 >> "+copy.getName());
		System.out.println("happy 이름 >> "+happy.getName());
		System.out.println(copy);

	}

}
