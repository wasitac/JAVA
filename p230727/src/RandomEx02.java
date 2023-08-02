
public class RandomEx02 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		System.out.println("랜덤값 >> " + num);
		switch(num) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		case 3:
			System.out.println("3이다.");
			break;
		case 4:
			System.out.println("4이다.");
			break;
		case 5:
			System.out.println("5이다.");
			break;
		case 6:
			System.out.println("6이다.");
			break;
		}
		
	}

}
