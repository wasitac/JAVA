package method.reference;

public class Ex03 {
	public static void main(String[] args) {
		// [method reference expression] 메서드 참조 표현식 =======================
		// 1. instance method 
		// a) anonymous class
		Fruit anonymousInstance = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
//				Add add = new Add();
//				return add.instanceAdd(s1, s2);
				return new Add().instanceAdd(s1, s2);
			}
		};
		
		System.out.println(anonymousInstance.selfIntroduction("[익명클래스] 첫번째", "두번째"));
		
		// b) lambda expression
		Fruit lambdaInstance = (s1, s2) -> {
//			Add add = new Add();
//			return add.instanceAdd(s1, s2);
			return new Add().instanceAdd(s1, s2);
		};
		
		System.out.println(lambdaInstance.selfIntroduction("[람다표현식] 하나", "둘"));
		
		// c) method reference expression : instance method
		Add add = new Add();
		Fruit one = add::instanceAdd;
//		Fruit two = new Add()::instanceAdd;
		
		System.out.println(one.selfIntroduction("[메서드 참조] 일", "이"));
		
		// 2. static method
		// a) anonymous class
		Fruit anonymousStatic = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return Add.staticAdd(s1, s2);
			}
		};
		System.out.println(anonymousStatic.selfIntroduction("[익명 클래스] one", "two"));
		
		// b) lambda expression
		Fruit lambdaStatic = (s1, s2) -> Add.staticAdd(s1, s2);
		System.out.println(lambdaStatic.selfIntroduction("[람다] one", "two"));
		
		// c) method reference expression
		Fruit referenceStatic = Add::staticAdd;
		System.out.println(referenceStatic.selfIntroduction("[메서드 참조] one", "two"));
		
	}
}
