
public class MethodEx07 {

	/*
	 * [지역 변수] : method 영역 내 선언된 변수 : 해당 영역 내에서만 접근 가능
	 */
	public static void main(String[] args) {

		int num = 5; // 지역변수 : main method 영역 내
		while (true) {
			int var = 100; // 지역변수 : while 영역 내
			System.out.println("var >> " + var);
			System.out.println(num);
			if (num == 5) {
				break;
			}
		}
		System.out.println("[while 종료 후 출력]");
//		System.out.println("var >> " + var);
		System.out.println("num >> " + num);

		for (int i = 0; i < 3; i++) { // 지역변수 : for문 내에서만 접근 가능
			System.out.println("[for문 내 출력] i >> " + i);
		}

		for (int var = 0; var < 3; var++) {
			System.out.println("[for문 내 출력] var >> " + var);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("[for문 내 출력] i >> " + i);
		}
		System.out.println("실행 완료");
	}

}
