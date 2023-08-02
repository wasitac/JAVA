public class MethodEx06 {
	
	public static void increment(int num) {
//		int var = 100;
		num++;
		System.out.println("1증가된 값 >>" + num);
	}
	//[main method 정의] =========================
	public static void main(String[] args) {
		// 지역 변수 = local variable --> stack 영역 할당
//		int one = 1;
		increment(5);
		int var = 11;
		System.out.println("main method 내 출력 >> " + var);
//		int two = 2;

	}

}
