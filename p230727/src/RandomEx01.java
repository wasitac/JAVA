
public class RandomEx01 {

	public static void main(String[] args) {
		/*
		 * 랜덤값
		 * 문법 : Math.random()
		 * 0 이상 1 미만의 랜덤값
		 */
		
		//랜덤값 : 1 ~ 100
		int ran = (int)(100* Math.random())+1;
		System.out.println(ran);
	}

}
