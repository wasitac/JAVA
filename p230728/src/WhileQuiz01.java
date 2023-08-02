public class WhileQuiz01 {

	public static void main(String[] args) {
		/*
		 * [문제] 1 ~ 10 덧셈 결과를 출력
		 * <출력형태>
		 * 1 ~ 10 누적합 : 55
		 * 
		 */
		int index = 0;
		int sum = 0;
		while (index < 10) {
			index++;
			sum += index;
		}
		System.out.println("1 ~ 10 누적합 : " + sum);
		
	}

}
