
public class OperatorEx03 {

	public static void main(String[] args) {
		//복합 대입 연산자
		int one = 5, two = 3;
		
		System.out.println("덧셈 전");
		System.out.println("one " + one);
		System.out.println("two " + two);
//		one = one + two;
		one += two;
		System.out.println("덧셈 후");
		System.out.println("one " + one);
		System.out.println("two " + two);

	}

}
