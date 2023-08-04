class Fruit {
	// field
	String sort;
	int count;

	// constructor
	Fruit(String sort, int count) {
		this.sort = sort;
		this.count = count;
	}

	// method
	void fruitInfo() {
		System.out.println(sort + "가 " + count + "개 있습니다.");
	}
}

public class ArrayInstanceEx02 {

	public static void main(String[] args) {
		Fruit[] fruit = new Fruit[] { 
				new Fruit("사과", 5), 
				new Fruit("바나나", 2), 
				new Fruit("망고", 3)
				};
		
		for(Fruit f : fruit)
			f.fruitInfo();
	}

}
