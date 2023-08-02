
public class WhileEx02 {

	public static void main(String[] args) {
		//구구단 2 단
//			int index = 0;
//			while (index < 9) {
//				index++;
//				System.out.printf("2 * %d = %d\n", index, 2 * index);
//			}

		int i = 1, index = 0;
		while(i < 9) {
			i++;
			while (index < 9) {
				index++;
				System.out.printf("%d * %d = %d\n", i, index, i * index);
			}
		}
	}

}
