class Person {
	static int count; // static field
	int age; // non-static field

	static void staticShow() { // static method
		System.out.println("현재 " + count + "명 있습니다."); // static field 접근 가능
//		System.out.println("나이는 " + age + "세 입니다.");	// non-static field 접근 불가능
		staticMethod();
//		instanceMethod();
	}

	static void staticMethod() {
		System.out.println("static method 입니다");
	}

	void show() { // non-static method
		System.out.println("현재 " + count + "명 있습니다."); // static field 접근 가능
		System.out.println("나이는 " + age + "세 입니다."); // non-static field 접근 가능
		staticMethod(); // static method 호출 가능
		instanceMethod(); // non-static method 호출 가능
	}

	void instanceMethod() {
		System.out.println("instance method 입니다");
	}
}

public class StaticEx04 {
	static void happy() {
		System.out.println("행복한 날!");	
	}
	
	public static void main(String[] args) {
		happy();
		
	}
}
