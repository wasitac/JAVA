package enumtype;

enum SeasonThree {
	// field
	// 상수만 있으면 종결연산자 생략 가능.
	// public static final Season SPRING = new Season("SPRING"); 과 마찬가지.(Ex03)
	SPRING, SUMMER, FALL, WINTER;

	// constructor
	// enum은 접근권한 자동으로 private
	private SeasonThree() {
	}
}

public class Ex05 {
	public static void main(String[] args) {
//		SeasonThree s = new SeasonThree();
		System.out.println(SeasonThree.SPRING);
		System.out.println(SeasonThree.SUMMER);
		System.out.println(SeasonThree.FALL);
		System.out.println(SeasonThree.WINTER);

		SeasonThree spring = SeasonThree.SPRING;
		SeasonThree spring2 = SeasonThree.SPRING;

		System.out.println(spring);
		if (spring == spring2)
			System.out.println("주소가 같다");
		else {
			System.out.println("주소가 다르다");
		}
		// 열거형의 클래스명 리턴
		System.out.println("참조변수 spring enum type >> " + spring.getDeclaringClass());

		// 열거형의 상수명 리턴(field에 저장된 값)
		System.out.println(spring.name());

		// 열거형 상수를 배열로 리턴
		// 아까 그 질문
		System.out.println(SeasonThree.values());
		System.out.println(SeasonThree.values()[1]);

		// 향상된 for문
		System.out.println("향상된 for문");
		for (SeasonThree season : SeasonThree.values()) {
			System.out.println(season);
		}

		// 열거형 상수의 값(인덱스)
		System.out.println("<< 열거형 상수 값 >>");
		for (SeasonThree s : SeasonThree.values()) {
			System.out.println(s.ordinal());
		}
	}
}