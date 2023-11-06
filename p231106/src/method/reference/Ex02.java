package method.reference;

@FunctionalInterface
interface Fruit {
	// abstract method
	String selfIntroduction(String s1, String s2);
}

// 1. class 구현 -> 2. anonymous class -> 3. lambda expression -> 
// 4. method reference expression

class Banana implements Fruit {
	@Override
	public String selfIntroduction(String s1, String s2) {
		return s1.concat(s2);
	}	
}

class Add{
	public Add() {
		System.out.println("[Add class] 생성자 실행됨");
	}
	String instanceAdd(String s1, String s2) {
		return s1.concat(", ").concat(s2);
	}
	static String staticAdd(String s1, String s2) {
		return s1 + " - " + s2;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// [1. class 구현 후 객체 생성]
		Banana banana = new Banana();
		System.out.println(banana.selfIntroduction("안녕~", "저는 바나나 입니다"));
		
		// [2. anonymous class]
		Fruit anonymousBanana = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return "[익명 클래스] " + s1.concat(s2);
			}
		};
		System.out.println(anonymousBanana.selfIntroduction("안녕하세요 ", "바나나에요"));
		
		// [3. lambda expression]
		Fruit lambdaBanana = (s1, s2) -> "[람다] " + s1.concat(s2);
		System.out.println(lambdaBanana.selfIntroduction("안녕안녕 안 녕 ", "나는 바나나"));
		
		// 4. method reference expression]
		// 4-1. instance method
		Add add = new Add();
		Fruit one = add::instanceAdd;
		System.out.println(one.selfIntroduction("첫번째", "두번째"));
		
		Fruit two = new Add()::instanceAdd;
		System.out.println(two.selfIntroduction("하나", "둘"));
		
		// 4-2. static method
		Fruit three = Add::staticAdd;
		System.out.println(three.selfIntroduction("일", "이"));
		
		// 4-3. constructor
		// [문제] 
		// 매개변수 없음, 리턴 없음
		Runnable constructor = Add::new;
		constructor.run();
	}
}
