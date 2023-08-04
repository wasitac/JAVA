
class Animal {
	//
}

public class StringEx03 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal);
		System.out.println(animal.toString());
		System.out.println(animal.getClass().getName());

		String str = "안녕";
		System.out.println(str);
		System.out.println(str.toString());
	}

}
