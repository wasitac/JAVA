
public class MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2, num2 = 5;
		int sumResult = sum(num1, num2);
		System.out.println("sum(2, 5) 호출결과 >> " + sumResult);
	}
	
	/*
	 * method 정의 
	 * [형태 2] 매개변수 있고, 리턴값 있음 
	 * 기능 : 인수를 2개 받은 후, 덧셈 결과 리턴 
	 * 메서드명 : sum, 매개변수 : 2개
	 * 
	 * return의 의미 
	 * -메서드 실행 끝 
	 * -호출한 쪽으로 값을 넘겨줌
	 * 
	 * method 실행 끝
	 * -return
	 * body의 }
	 */
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
