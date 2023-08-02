
public class IfEx04 {
	/*
	 * 조건 3개 이상
	   if (조건식) {
			명령어;
		} else if(조건식) {
			명령어;
		} else {
			명령어;
		}
		*/
	public static void main(String[] args) {
		int num = 15;
		
		if (num > 5) {
			System.out.println("5보다 크다.");
		} else if(num < 5) {
			System.out.println("5보다 작다.");
		} else {
			System.out.println("5와 같다.");
		}
		
		System.out.println("실행종료");
	}

}
