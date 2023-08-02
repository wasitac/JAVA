public class MethodEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = returnString();
		System.out.println("returnString() 호출결과 >> " + str);
		System.out.println(returnString());
	}
	
	/*
	 * [method 정의 형태]
	 * [형태 4] 매개변수 없고, 리턴값 있음
	 * 기능 : 호출하면 문자열 리턴 
	 */
	public static String returnString() {
		return "안녕";
	}

}
