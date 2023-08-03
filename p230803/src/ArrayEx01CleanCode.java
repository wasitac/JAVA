public class ArrayEx01CleanCode {

	public static void main(String[] args) {
		// [우리 반 학생들의 수학 점수 저장]
		// 1. 배열 생성과 동시에 초기화
		// : 반드시 길이 생략!
//		int[] math = new int[] {80, 95, 90, 70, 100};
		int[] math = {80, 95, 90, 70, 100};
		
		// <<일반 for문>>
		for (int i = 0; i < math.length; i++)
			System.out.printf("math[%d] >> %d\n", i, math[i]);

		// <<향상된 for문>>
		for(int i: math)
			System.out.println(i);
	}

}
