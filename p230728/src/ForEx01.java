
public class ForEx01 {

	public static void main(String[] args) {
		//while
		int idx = 1;	//초기값 설정
		
		while(idx < 3) {//조건식
			System.out.println("idx >> " + idx);
			idx++;		//증감식
		}
		
		//for
		System.out.println("*for문 실행*");
		for(idx = 1; idx < 3; idx++) {
			System.out.println("idx >> " + idx);
		}
	}

}
