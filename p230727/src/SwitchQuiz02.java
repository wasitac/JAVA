public class SwitchQuiz02 {

	public static void main(String[] args) {
		
		int num = 25;
		
//		if(num>=0 && num<10)
//			System.out.println("0이상 10미만인 수");
//		else if(num >= 10 && num<20)
//			System.out.println("10이상 20미만의 수");
//		else if (num>=20 && num < 30) 
//			System.out.println("20이상 30미만의 수");
//		else {
//			System.out.println("30이상의 수");
//		}
		
		switch (num/10) {
		case 0:
			System.out.println("0이상 10미만인 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;

		default:
			System.out.println("30이상의 수");
			break;
		}

	}

}
