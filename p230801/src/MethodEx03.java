
public class MethodEx03 {
	//  [메서드 정의] ===================================
	public static int increment(int num) {
		num++;
		return num; 
		//return num, 100; //return 값은 1개만 가능!
		//return 100  	 //return num; 아래 코드 라인은 실행되지 않음!
	}
	
	public static String strReturn(String str) {
		return "매개변수 : " + str;
	}
	
	public static void main(String[] args) {
		int result = increment(5);
		System.out.println("increment(5) 실행결과 >> " + result);
		System.out.println("strReturn (안녕) 실행 결과 >> " + strReturn("안녕~"));
	}

}
