package generic;

class Person {
	private String name;
	private String[] strArr;
	public Person() {
		this.strArr = new String[]{"홍길동", "박보검", "이미자"};
	}
	
	public void showArray() {
		for (String name : strArr) {
			System.out.println(name);
		}
	}
}

public class Ex10 {
	
	// [제네릭 메서드] generic method
	public static <T> void showArray(T[] t) {
		for(T type : t) {
			System.out.println(type);
		}
	}
	
	public static void main(String[] args) {
		Integer[] i = {1, 3, 5, 6};
		String[] strArr = {"안녕", "좋은", "주", "말"};
		Person p = new Person();
		p.showArray();
		
		// [문제] Person class로 길이가 3인 배열 생성히시오.
		// showArray()메서드 호출하여 출력이 다음과 같이 되도록 하시오.
		// 홍길동
		// 박보검
		// 이미자
	}

}
