package enumtype;

enum Number {
	// public static final Number ONE = new Number("ONE");
	ONE(1), TWO(2), THREE(3), FOUR(4);

	private int num;

	private Number(int num) {
		this.num = num;
	}

	public int getNum() {
		return this.num;
	}

	@Override
	public String toString() {
//		return "" + this.num;
		return String.valueOf(this.num);
	}
}

public class Ex06Quiz {
	public static void main(String[] args) {
		Number currentNumber = Number.ONE;

		switch (currentNumber) {
		case ONE:
			System.out.println("1입니다.");
			break;
		case TWO:
			System.out.println("2입니다.");
			break;
		case THREE:
			System.out.println("3입니다.");
			break;
		case FOUR:
			System.out.println("4입니다.");
			break;
		}

		System.out.println(Number.ONE);

		// 서수(순서) : 첫째, 둘째, ...
		// 기수(기본) : 하나, 둘, 셋, ... --> 기본숫자, 양
		System.out.println("<< 서수 출력 >>");
		for (Number n : Number.values())
			System.out.println(n.ordinal());

		System.out.println("설정된 상수 값 출력");
		for (Number n : Number.values())
			System.out.println(n.getNum());

		// [과제]
		System.out.println("<< 과제 >>");
		System.out.println(Number.ONE);
		System.out.println(Number.TWO);
		System.out.println(Number.THREE);
		System.out.println(Number.FOUR);
	}
}
