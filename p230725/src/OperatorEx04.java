public class OperatorEx04 {

	public static void main(String[] args) {
		//관계 연산자
		int one = 5, two = 3;
		System.out.println("크니? " + (one > two));
		System.out.println("같니? " + (one == two));
		System.out.println("다르니? " + (one != two));
		System.out.println("크거나 같니? " + (one >= two));
		System.out.println("크거나 같니? " + (one >= two));
		
		//논리연산자
		boolean result1, result2, result3;
		result1 = (one > 4) && (two > 4);
		result2 = (one > 4) || (two > 4);
		result3 = ! (one > 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
