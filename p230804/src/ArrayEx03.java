
public class ArrayEx03 {

	public static void main(String[] args) {

		// [2차원 배열 생성]
		int[][] arr = new int[2][];

		System.out.println("arr" + arr);
		System.out.println("arr[0] " + arr[0]);
		System.out.println("arr[1] " + arr[1]);
		
		arr[0] = new int[3];
		arr[1] = new int[] {5};
		
		//향상된 for문
		for(int[] i : arr) {
			for(int j : i)
				System.out.print(j + " ");
			System.out.println();
		}
	}

}
