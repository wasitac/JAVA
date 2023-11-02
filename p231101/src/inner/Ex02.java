package inner;

class OuterTwo {
	String name;
	int age;
	
	class InnerTwo {
		String name = "INNER";
		String innerId = "1111";
		
		public void setName(String name) {
			OuterTwo.this.name = name;
		}
		public String getName() {
			return name;
		}
	}
}
public class Ex02 {

	public static void main(String[] args) {
		OuterTwo out = new OuterTwo();
		OuterTwo.InnerTwo in = out.new InnerTwo();
		in.setName("홍");
		System.out.println(in.getName());
		
	}
	

}
