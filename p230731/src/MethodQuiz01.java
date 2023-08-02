public class MethodQuiz01 {
	// add method 정의
	// -기능 : 인수 2개 받아서, 누적합 계산 후 출력
	// -메서드명 : add, 매개변수 2개, 리턴값 : 없음
	public static void add(int a, int b) {
		int sum = 0;
		int c = 0;
		
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		
		for(int i = a; i <= b; i++)
			sum += i;
 
//		while (a < b + 1){
//			sum += a;
//			a++;
//		}
		System.out.printf("%d~%d의 누적합 >> %d\n", a, b, sum);
	}

	// [main method 정의]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(-3, 3);
		add(6, 2);
	}

}
