
public class MethodEx05 {
	
	public static int sum(int n1, int n2) { //매개변수의 타입 생략 불가능! 반드시 명시
		int result = n1 + n2;
		return result;
	}
	
	public static void showString() {
		System.out.println("showString() 실행!");
	}
	
	//[main method 정의]============================
	public static void main(String[] args) {
		sum(2, 5);
		showString();
	}

}
