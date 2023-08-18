
class Pattern {
	private static Pattern member_field = new Pattern();

	// 생성자의 접근 제어자 private : 외부에서 객체생성 불가능!
	private Pattern() {
	}

	// 왜static이어야한다고??
	public static Pattern getPattern() {
		System.out.println("[Pattern class 내 member_field >> " + member_field);
		return member_field;
	}

	@Override
	public String toString() {
		return "Pattern 클래스입니다.";
	}

	// [문제] count field 추가
	private int count = 100;

	public int getCount() {
		return count;
	};

}

public class Ex03Quiz {

	public static void main(String[] args) {
		Pattern p = Pattern.getPattern();
		System.out.println("p >> " + p);
		Pattern p2 = Pattern.getPattern();
		System.out.println("p2 >> " + p2);
		System.out.println(p.getCount());
	}

}
