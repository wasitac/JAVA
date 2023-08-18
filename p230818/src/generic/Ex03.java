package generic;

interface Available {
	void selfIntroduction();

}

class Tree {
	private String sort;
	private int age;

	public Tree() {
		// TODO Auto-generated constructor stub
	}

	public Tree(String sort, int age) {
		this.sort = sort;
		this.age = age;
	}

	public void info() {
		System.out.printf("[INFO] 종류 : %s, 나이 : %d\n\n", sort, age);
	}

}

class Maple extends Tree implements Available {

	public Maple(String sort, int age) {
		super(sort, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selfIntroduction() {
		System.out.println("저는 단풍나무입니다.");
	}

}

class Pine extends Tree implements Available {

	public Pine(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무이다.");
	}

}

public class Ex03 {
	// 제네릭 매개변수는 Object method만 호출 가능
	// : 따라서 강제 형변환 --> 자료형에 안전하지 않은 코드
	//   강제 형변환이 Available로 설정됨에 따라, 실행시 error 발생 가능성 있음
	//   제네릭 장점 사라짐
	//   그래서 Java는 제네릭 매개변수 자료형에 제한을 두는 문법 제공
	//	 자료형에 안전한 구조 구성
	
	// [자료형에 안전하지 않은 코드]=================================
	// : 매개변수에 아무거나 들어갈 수 있다
//	public static <T> void callSelfIntroduction(T t) {
//		((Available) t).selfIntroduction();
//	}
//
//	public static <T> void callInfo(T t) {
//		((Tree) t).info();
//	}

	// [자료형에 안전한 코드]=====================================
	// 제네릭 매개변수 type 제한에 사용된 extends
	// : class와 interface를 구분하지 않고, 키워드 extends 사용
	public static <T extends Available> void callSelfIntroduction(T t) {
		t.selfIntroduction();
	}
	// extends
	public static <T extends Tree> void callInfo(T t) {
		 t.info();
	}

	public static void main(String[] args) {
		Maple maple = new Maple("당단풍나무", 25);
		Pine pine = new Pine("금강고로쇠", 33);

//		Ex03.<Maple>callSelfIntroduction(maple);
		callInfo(maple);

		callSelfIntroduction(pine);
		callInfo(pine);
	}
}
