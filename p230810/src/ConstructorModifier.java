import modifier.Fruit;

public class ConstructorModifier {

	public static void main(String[] args) {
		//Fruit 생성자에 public이 붙어있어야 여기서 객체 생성 가능하지
		Fruit fruit = new Fruit(10);
		System.out.println(fruit);
	}

}
