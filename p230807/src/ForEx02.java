class Fruit {
	// field
	String sort;
	int count;

	// constructor
	Fruit(String sort, int count) {
		this.sort = sort;
		this.count = count;
	}

	void setCount(int count) {
		this.count = count;
	}

	// method
	void fruitInfo() {
		System.out.println(sort + "가 " + count + "개 있습니다.");
	}
}

public class ForEx02 {

	public static void main(String[] args) {
		// 길이가 3인 객체 배열 생성
		Fruit[] fruit = new Fruit[3];

		fruit[0] = new Fruit("사과", 5);
		fruit[1] = new Fruit("바나나", 2);
		fruit[2] = new Fruit("망고", 3);

		System.out.println("<< 과일 정보 출력 1) >>");
		for (Fruit f : fruit)
			f.fruitInfo();
		
		System.out.println("<< 과일 정보 출력 2) >>");
		for (Fruit f : fruit) {
			f.setCount(100);
			f.fruitInfo();
		}

		System.out.println("<< 과일 정보 출력 3) >>");
		for (Fruit f : fruit)
			f.fruitInfo();
	}

}
