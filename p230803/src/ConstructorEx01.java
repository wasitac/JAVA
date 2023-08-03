/*
[생성자] constructor
생성자를 사용하는 이유
객체 생성하면서, 멤버변수 원하는 값으로 초기화

객체 생성하면서, 원하는 기능을 실행하기 위해서(특정 멤버 메서드)
	- 객체 생성시, 무조건 하나의 생성자 호출
	- 생성자는 ‘메서드’이다. → 메서드 오버로딩 가능 → 생성자 여러개 정의 가능
	- 생성자는 반환형 없음(명시하지 않음) → 리턴값 없음
	- 생성자명은 클래스명과 같아야 함

[기본 생성자] default constructor
	- 생성자를 명시하지 않으면, 기본 생성자 실행
	- 매개변수 없고, 하는 일도 없다 → 형식상 실행
	- 생성자가 하나라도 명시되어 있다면, 기본 생성자는 실행되지 않는다
 */
class Student {
	// 멤버 변수 : [field]
	int age;
	String name;
	
	// 생성자 : [constructor]
	Student(){
		this(0, null);
	}
	
	Student(String name){
		//생성자 호출 앞에 다른 코드를 적으면 안된다
		this(0, name);
//		this.name = name;
//		showInfo();
	}

	Student(int age){
		this(age, null);
	}
	
	Student(int age, String name){
		this.age = age;
		this.name = name;
		showInfo();
	}
	
	// setter
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 멤버 메서드 : [method]
	void showInfo() {
		System.out.println("이름은 " + this.name + " 나이는 " + this.age + "세입니다.");
	}
}

public class ConstructorEx01 {
	public static void main(String[] args) {
		// 지역변수 : local variable
		int num =5;
		
		Student hong = new Student(26, "홍길동");
//		hong.setName("홍길동");
//		hong.setAge(26);


		Student park = new Student("박보검");
//		park.setName("박보검");
//		park.setAge(32);

		Student lee = new Student(55);

				
	}
}
