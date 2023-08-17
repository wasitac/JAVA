package enumtype;

class Season {
	public static final Season SPRING = new Season("봄");
	public static final Season SUMMER = new Season("여름");
	public static final Season FALL = new Season("가을");
	public static final Season WINTER = new Season("겨울");

	// field
	private String name;

	private Season(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

public class Ex03 {
	public static void main(String[] args) {
//		Season s = new Season();

		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);

		Season spring = Season.SPRING;
		Season spring2 = Season.SPRING;

		if (spring == spring2) {
			System.out.println("같다");
		}
		String s = "hi";

		switch (s) {
		case "hi":
			System.out.println("hi입니다.");
		}

	}
}
