
class Student {
	int age;
	String name;

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

public class InstanceEx06 {
	// 매개변수로 참조변수를 -> 참조형 매개변수
	public static void newYear(Student student) {
		System.out.println("이름 >> " + student.getName());
		int age = student.getAge();
		student.setAge(++age);

	}

	public static void main(String[] args) {
		// hong 인스턴스 생성
		Student hong = new Student();
		hong.setAge(26);
		hong.setName("홍길동");

		newYear(hong);
		System.out.println("홍길동 나이 >> " + hong.getAge());
		System.out.println("홍길동 이름 >> " + hong.getName());

		Student park = new Student();
		park.age = 32;
		park.name = "박보검";
		System.out.println("박보검 나이 >> " + park.getAge());
		newYear(park);
		System.out.println("[newYear 메소드 실행 후] 박보검 나이 >> " + park.getAge());
		
		newYear(new Student());
	}

}
