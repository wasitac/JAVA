package modifier;

public class Fruit {
	private int count;
	
	public Fruit() {}
	
	public Fruit(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "나는 과일이다.";
	}

	public static void main(String[] args) {
		System.out.println("과일이 "+ "개 있습니다");
	}

}
