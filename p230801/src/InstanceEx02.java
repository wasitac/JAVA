
 // Person class 정의
class Person{
	// 멤버 변수
	int age;
	String name;
	String address;
	
	// 멤버 메서드
	// setter
	void setAge(int a) {
		age = a;
	}
	// getter
	int getAge() {
		return age; // 내부접근
	}
	
	void setName(String str) {
		name = str;
	}
	
	String getName() {
		return name;
	}
}
  
 
public class InstanceEx02 {

	public static void main(String[] args) {
		// 1. 참조 변수 선언
		Person p1;
		
		// 2. 인스턴스(객체) 생성
		p1 = new Person();
		
		// 멤버 변수 age 접근
		// 참조변수를 통한 멤버 변수 접근을 권장하지 않음	: 외부접근
		// --> 멤버 메서드를 통해 멤버 변수에 접근 : 내부접근
		//System.out.println("나이 >> " + p1.age);
		System.out.println("나이 : 초기값 >> " + p1.getAge());
		p1.setAge(25);
		System.out.println("나이 >> " + p1.getAge());
		p1.setName("홍길동");
		System.out.println("이름 >> " + p1.getName());
	}

}
