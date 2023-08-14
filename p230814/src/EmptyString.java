
public class EmptyString {

	public static void main(String[] args) {

		String one = ""; // 빈 문자열
		String two = " "; // 공백
		String three = null; // 문자열 없음

		System.out.println("<<출력>>");
		System.out.println("one : " + one);
		System.out.println("two : " + two);
		System.out.println("three : " + three);

		// [빈 문자열 확인 1] equals() method---------------------
		System.out.println("<< equals() : 문자열 비교 >>");
		System.out.println(one.equals(""));
		System.out.println(two.equals(""));
//		System.out.println(three.equals("")); //NullPointException

		// [빈 문자열 확인 2] length() method --------------------
		System.out.println("<< length() : 문자열 길이 >>");
		System.out.println(one.length());
		System.out.println(two.length());
//		System.out.println(three.length); //NullPointException

		// [빈 문자열 확인 3] isEmpty() method -------------------
		// : java6 이후 추가 - 문자열의 길이가 0인 경우 true 리턴
		System.out.println(one.isEmpty());
		System.out.println(two.isEmpty());
//		System.out.println(three.isEmpty());

		// [빈 문자열 확인 3] isEmpty() method -------------------
		// : java11 이후 추가 - 빈 문자열이거나 공백만으로 이뤄진 경우 true 리턴
		System.out.println(one.isBlank());
		System.out.println(two.isBlank());
//		System.out.println(three.isBlank());
		System.out.println("hi".isBlank());
	}

}
