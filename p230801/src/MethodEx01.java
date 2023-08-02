
public class MethodEx01 {
	/*
	 * [메서드 정의]=====================================
	 * 덧셈
	 */
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static double sub(int n1, int n2) {
		return n1 - n2;
	}
	
	public static String str() {
		return "문자열 리턴";
	}
	public static void main(String[] args) {
		System.out.println("add(5, 2) 호출결과 >> " + add(5, 2));
		System.out.println("sub(5, 2) 호출결과 >> " + sub(5, 2));
	}

}
