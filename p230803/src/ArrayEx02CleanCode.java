
public class ArrayEx02CleanCode {
	public static void main(String[] args) {
		// [1차원 배열] 길이가 1개인 배열 ==============
		// int형의 길이가 5인 1차원 배열 arr 생성
//		int[] arr = new int[] {2, 4, 6, 8, 10};
		int[] arr = {2, 4, 6, 8, 10};

		// [2차원 배열] 길이가 2개인 배열 ==============
//		int[][] arr2 = new int[][] {{2, 4, 6}, {8, 10, 12}};
		//가변 배열
		int[][] arr2 = {{2, 4}, {6, 8, 10, 12}};
		// 자료형[][] 배열명 = new 자료형[행길이][열길이]
		
	
		// 일반 for문
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++)
				System.out.print(arr2[i][j] + " ");
			System.out.println();
		}

		// 향상된 for문
		for (int[] i : arr2) {
			for (int j : i)
				System.out.print(j + " ");
			System.out.println();
		}

	}
}
