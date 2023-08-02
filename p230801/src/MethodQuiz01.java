/*
 * [메서드 정의]================================
 * 기능 : 인수로 정수 1개를 입력하면, 제곱값 출력
 * 메서드명 : square, 매개변수 : 1개, 리턴값 : 없음
 * ==========================================
 */
public class MethodQuiz01 {

	public static void square(int num) {
		System.out.printf("%d의 제곱은 %d입니다.\n", num, num*num);
	}
	
	public static void main(String[] args) {
		square(2);//2의 제곱은 4입니다.
		square(5);
	}

}
