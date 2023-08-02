/*
 * 문제
 * 중첩 while문을 사용한 구구단
 */
public class NestedLoopQuiz02 {

	public static void main(String[] args) {
		int i = 1;

		while (i < 9) {
			i++;
			int j = 0;

			while (j < 9) {
				j++;
				System.out.printf("%d * %d = %d\n\n", i, j, i * j);
			}
		}
	}

}
