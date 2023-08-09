/*
 * [메서드] method
 * 변수 선언 : 값 저장
 * 메서드 정의 : 기능, 동작
 * 	반환형 메서드명(매개변수, 매개변수){
 * 		명령문;
 * 		명령문;
 * 		return 값;}
 * 
 * 메서드 호출
 * 	메서드명(인수, 인수);
 */

public class MethodEx01 {

	public static void main(String[] args) {
		System.out.println("== main method 시작 ==");
		int num = increment(5);
		
		System.out.println("== main method 종료 =="+num);
	}

	// [형태 1] 매개변수 있고, 리턴값 없음
	// 기능 : 호출하면서 입력한 값을 1증가 후 출력
	public static int increment(int num) {
//		System.out.println(">> increment method 시작 <<");
		num++;
//		System.out.println("1 증가된 값 >> " + num);
//		System.out.println(">> increment method 종료 <<");
		return num;
	}

}
