
public class IfEx07 {

	public static void main(String[] args) {
		
		int score = 95;
		
		if (score >= 90) {
			System.out.println("점수 90~100입니다");
			System.out.println("등급은 A입니다");
		} else if (score >= 80) {
			System.out.println("점수 80~90입니다");
			System.out.println("등급은 B입니다");
		} else if (score >= 70) {
			System.out.println("점수 70~80입니다");
			System.out.println("등급은 C입니다");
		} else {
			System.out.println("점수 70 미만입니다");
			System.out.println("등급은 D입니다");
		}
		

	}
	
}
