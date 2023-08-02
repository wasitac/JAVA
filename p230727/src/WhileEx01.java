/*
 * 반복문 
 * while문
 * 조건이 true일 동안 반복 -> 처음으로 false가 되는 순간 탈출
 * 
 * while(조건식){
 * 	명령어;
 * 	증감식;
 * }
 */
public class WhileEx01 {

	public static void main(String[] args) {
		int num = 1;

		while (num < 4) {
			System.out.println("num >>" + num);
			num++;
		}
		System.out.println("** 실행 완료 **");
	}

}
