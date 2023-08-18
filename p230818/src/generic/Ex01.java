package generic;

class Apple {
	@Override
	public String toString() {

		return "사과는 멸종위기 아님";
	}
}

class Banana {
	@Override
	public String toString() {

		return "바나나는 멸종위기";
	}
}

class InstanceType {
	private int count;

	// 제네릭 메서드
	public <T> void showInstanceType(T type) {
		System.out.println("type >> " + type);
		count++;
	}

	public void showCount() {
		System.out.println("count >> " + this.count);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Banana banana = new Banana();

		InstanceType in = new InstanceType();
		in.<Apple>showInstanceType(apple);
		in.showCount();

		in.<Banana>showInstanceType(banana);
		in.showCount();

		in.<String>showInstanceType("안녕");
		in.showCount();
	}
}
