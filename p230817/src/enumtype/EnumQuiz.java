package enumtype;
enum Shoes {
	//
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트레킹화"), HIKING("등산화");
	
	String item;
	private Shoes(String item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return item;
	}
}
public class EnumQuiz {
	public static void main(String[] args) {
		System.out.println("<< 상수 출력 >>");
		System.out.println(Shoes.WALKING);  // 워킹화
		System.out.println(Shoes.RUNNING);	// 러닝화
		System.out.println(Shoes.TRACKING);	// 트레킹화
		System.out.println(Shoes.HIKING);	// 등산화
	}
}
