/*
 * [반복문} do~while문
 * 
 * do {
 * 	명령어;
 * } while(조건식);
 * 
 * 조건에 상관없이 한번은 실행 
 * 
 */
public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int idx = 5;
		
		do {
			System.out.println("idx >> " + idx);
			idx++;
		} while (idx < 5);
		System.out.println("반복문 실행 후 idx >> " + idx);
		System.out.println("**실행 완료**");
		
	}

}
