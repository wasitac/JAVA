
class Person {
	// 멤버 변수
	int age;
	String name;
	String address;

	// setter/getter
	void setAge(int age) {
		this.age = age;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAddress(String address) {
		this.address = address;
	}

	int getAge() {
		return this.age;
	}

	String getName() {
		return this.name;
	}
	
	String getAddress() {
		return this.address;
	}

	void showInfo() {
		// 내부 접근
		System.out.println("나이 >> " + this.age);
		System.out.println("이름 >> " + this.name);
		System.out.println("주소 >> " + this.address);
	}
}

public class InstanceEx04 {
	public static void main(String[] args) {
		// 1. 참조 변수 선언
//		Person p1 = null;

		// 2. 인스턴스(객체) 생성
//		p1 = new Person();

		// 1과 2를 한 라인에
		Person p1 = new Person();

		// 3. 멤버 접근 : 외부 접근
		// 3.1. 멤버 메서드 호출
		p1.showInfo();
		
		// 3.2. setter 호출
		p1.setAge(26);
		p1.setName("이지홍");
		p1.setAddress("서울 서대문구");
	}
}
