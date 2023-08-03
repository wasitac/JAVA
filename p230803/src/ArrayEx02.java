
public class ArrayEx02 {

	public static void main(String[] args) {
		// [1차원 배열] 길이가 1개인 배열 ==============
		// int형의 길이가 5인 1차원 배열 arr 생성
//		int[] arr = new int[5];
//		System.out.println("arr >> " + arr);

		int[][] arr2 = new int[2][3];
		// 자료형[][] 배열명 = new 자료형[행길이][열길이]
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		arr2[1][0] = 8;
		arr2[1][1] = 10;
		arr2[1][2] = 12;

		// length변수 없이
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr2[i][j] + " ");
			System.out.println();
		}
		
		// length변수 써서
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++)
				System.out.print(arr2[i][j] + " ");
			System.out.println();
		}
		
		// 향상된 for문
		for (int i : arr2[0])
			System.out.print(i + " ");
		System.out.println();
		for (int i : arr2[1])
			System.out.print(i + " ");
		System.out.println();
		
		// 2차원 배열은 1차원 배열이 여러개 있는것. 1차원 배열의 주소들을 저장해놓은 배열이 있는것
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	}

}
