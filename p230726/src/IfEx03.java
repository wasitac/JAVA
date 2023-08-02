
public class IfEx03 {
	/* 조건 2개
	 * if(조건식){
	 * 	true일 때 실행되는 영역
	 * }
	 * else{
	 * 	false일 때 실행되는 영역
	 * }
	 * */
	public static void main(String[] args) {

		int num = 5;

		if(num > 10) {
			System.out.println("조건 true");
			num = num + 2;
		} else {
			System.out.println("조건 false");
			num = num - 2;
		}
		
		System.out.println("num >> " + num);
	}

}
