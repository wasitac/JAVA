package enumtype;
enum Shoes {
	//상수 constant
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트레킹화"), HIKING("등산화");
	
	//field
	String item;
	
	//constructor
	private Shoes(String item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return item;
	}
	
	public String getItem() {
		return this.item;
	}
}
public class EnumQuiz {
	public static void main(String[] args) {
		System.out.println("<< 상수 출력 >>");
		System.out.println(Shoes.WALKING);  // 워킹화
		System.out.println(Shoes.RUNNING);	// 러닝화
		System.out.println(Shoes.TRACKING);	// 트레킹화
		System.out.println(Shoes.HIKING);	// 등산화

		System.out.println("향상된 for문 >> 설정한 상수값 출력");
		for (Shoes shoes : Shoes.values()) {
			System.out.println(shoes);
		}
		
		System.out.println("<<향상된 for문 >> 기본으로 설정된 상수값 출력");
		for (Shoes s: Shoes.values())
			System.out.println(s.ordinal());
	}
}
