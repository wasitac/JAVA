/*
 * continue
 * - 반복문 내에서 조건문과 함께 사용
 * - 의미 : 이하 라인 생략
 */
public class WhileEx03 {

	public static void main(String[] args) {
		
		int idx = 0; 		//초기값
		
		while(idx < 10) { 	//조건식
			idx++;			//증감식
			if (idx % 2 == 1) {
				continue;          
			}
			System.out.println("idx >> " + idx);
		}
		
		System.out.println("**실행완료**");
	}

}
