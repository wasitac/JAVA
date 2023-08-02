/*
 * 조건문 switch
 *
 * switch(정수값) { //변수, 간단한 식
 * case 값1:
 * 	명령어;
 * case 값2:
 * 	명령어;
 * default:
 * 	명령어;
 * 
 */
public class SwitchEx01 {

	public static void main(String[] args) {
		
		int num = 2;
		
		switch(num) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		case 3:
			System.out.println("3이다.");
			break;
		default:
			System.out.println("나머지이다");
		}
		
		System.out.println("실행 완료!!");

	}

}
