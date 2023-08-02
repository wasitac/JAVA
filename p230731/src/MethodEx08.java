/*
 * [메서드 오버로딩] method overloading
 * : 같은 이름의 메서드를 여러개 정의
 * : 단, 매개변수의 정보(자료형, 개수)가 달라야 함
 */

public class MethodEx08 {
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}

	public static void main(String[] args) {
		sum(2, 5);
		sum(2.1, 3.5);
	}

}
