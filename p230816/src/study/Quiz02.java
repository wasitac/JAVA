package study;

public class Quiz02 {

	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int min = 1024 * 1024 * 1024 * 2 - 1;
		int max = 1024 * 1024 * 1024 * 2;
		
		for (int i : score) {
			if (min > i) {
				min = i;
			} else if (max < i) {
				max = i;
			}
		}

		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
