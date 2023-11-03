package lambda;

@FunctionalInterface
interface Mood {
	String howAreYouFeeling(String feel);
}

class Person implements Mood {
	@Override
	public String howAreYouFeeling(String feel) {

		return "오늘 기분은 ?--> " + feel;
	}
}

public class Ex01 {

	public static void main(String[] args) {

		// 객체 생성
		Mood instance = new Person();
		String s = instance.howAreYouFeeling("좋아요~");
		System.out.println(s);

		// << 익명 클래스 >>
		// [형태 1] 참조 변수에 저장
		Mood moodOne = new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "오늘 기 분 은 " + feel;
			}
		};

		String one = moodOne.howAreYouFeeling("비밀입니다");
		System.out.println(one);

		// [형태 2]
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "오늘 기 분 은 " + feel;
			}
		}.howAreYouFeeling("신기하다!"));

		// << 람다 >>
		// [형태 1] 참조변수에 람다식을 저장
		Mood lambdaOne = (String feel) -> {
			return "오늘 기분은 " + feel;
		};
		String s_one = lambdaOne.howAreYouFeeling("람 다");
		System.out.println(s_one);
		// [형태 1.2]
		// 괄호를 생략하려면 매개변수의 타입을 생략해야 한다.
		Mood lambdaTwo = a -> {
			return "오늘 기분은 " + a;
		};
		String s_two = lambdaOne.howAreYouFeeling("괄호를 생략하고 싶은 기분이야");
		System.out.println(s_two);

		// [형태 1.3]
		// 중괄호를 생략하려면 리턴을 생략해야 한다. 자동리턴 마치 js 
		Mood lambdaThree = a -> "오늘 기분은 " + a;
		String s_three = lambdaOne.howAreYouFeeling("중괄호를 생략하고 싶은 기분이야");
		System.out.println(s_three);
		
		// [형태 2] 람다식을 인수에 사용
		// 람다식으로 변경 불가능 -> 추정할 수 없기 때문
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "오늘 기 분 은 " + feel;
			}
		}.howAreYouFeeling("신기하다!"));

	}

}
