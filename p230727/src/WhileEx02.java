/*
 * 1. 무한 루프
 * - while(true)
 * - 반복문 내 break 명시
 * 
 * 2. break
 * - 반복문 내에서 조건문과 함께 사용
 * - 반복문이 실행되다가 break를 만나는 순간, 반복문 탈출
 * - 의미 : 반복문 탈출
 */

public class WhileEx02 {

	public static void main(String[] args) {
		int idx = 1;
		
		while (true) {
			System.out.println("idx >> " + idx);
			if (idx == 3)
				break;
			idx++;
		}
	}

}
