package enumtype;

enum SeasonTwo {
	SPRING, SUMMER, FALL, WINTER;
}

public class Ex04 {
	public static void main(String[] args) {
		SeasonTwo spring = SeasonTwo.SPRING;
		SeasonTwo summer = SeasonTwo.SUMMER;
		
		switch (spring) {
		case SPRING:
			System.out.println("봄이다.");
			break;
		case SUMMER:
			System.out.println("여름이다.");			
			break;
		case FALL:
			System.out.println("가을이다.");			
			break;
		case WINTER:
			System.out.println("겨울이다.");			
			break;

		default:
			break;
		}
	}
}
