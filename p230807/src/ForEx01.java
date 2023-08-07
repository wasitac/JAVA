

public class ForEx01 {
	public static void main(String[] args) {
		
		//1차원 배열
		int[] arr = {2, 4, 6};
		
		//향상된 for문
		for(int ar : arr) {
			ar += 10;
			System.out.println(ar + " ");
		}
		
		System.out.println();
		
		for(int ar : arr) {
			System.out.println(ar + " ");
		}
	}
}
