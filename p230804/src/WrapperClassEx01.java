
public class WrapperClassEx01 {

	public static void main(String[] args) {
/*
 * [Wrapper class] ====================================================
 * Boolean - Byte - Short - Character - Integer - Long - Float - Double
 * 
 */
		int num = 5;
		Integer num2 = 5;
//		Integer num3 = new Integer(5);
		Integer num3 = Integer.valueOf(5);
		System.out.println(num);
		System.out.println(num2.toString());
		
		int num4 = num2;
		System.out.println(num4);
	}

}
