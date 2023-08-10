class Fruit {
	// field
	private int count;
	
	//constructor
	public Fruit() {}
	
	public Fruit(int count) {
		this.count = count;
	}

	// method
	// getter/setter를 정의해 private field에 접근.
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void showCount() {
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}

	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메서드입니다.");
	}
}

class Banana extends Fruit {
	// [문제 2] 생성자를 이용하여 부모 class Fruit의 count field에 값 설정하시오.
	public Banana() {}

//	public Banana(int count) {
//		setCount(count);
//	}
	
	public Banana(int count) {
		super(count);
	}

	// [문제 1] showInfo() 메서드를 오버라이딩(overriding)하시오.
	// [출력 형태]
	// 현재 과일은 바나나 입니다.
	// 바나나는 X개 있습니다.
	@Override
	public void showInfo() {
		System.out.println("현재 과일은 바나나 입니다.");
		System.out.printf("바나나는 %d 개 있습니다.\n", super.getCount());

	}

}

public class InheritanceQuiz01 {

	public static void main(String[] args) {
		Banana bananaOne = new Banana();
		bananaOne.showInfo();

		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
	}

}
