package inner;

class OuterThree {
	String outerName = "...";

	class InnerThree {
		String innerName;

		public void setOuterName(String name) {
			OuterThree.this.outerName = name;
		}

		public void setInnerName(String name) {
			this.innerName = name;
		}

		public void showAllName() {
			System.out.println("[outer field] " + OuterThree.this.outerName);
			System.out.println("[inner field] " + this.innerName);
		}
	}
};

public class Ex03 {

	public static void main(String[] args) {
		OuterThree outer = new OuterThree();
		OuterThree.InnerThree in = outer.new InnerThree();
		OuterThree.InnerThree in2 = outer.new InnerThree();
		in.setOuterName("1");
		in.setInnerName("2");
		in2.setOuterName("3");
		in2.setInnerName("4");
		in.showAllName();
	
		in2.showAllName();
		in2.setOuterName("박보검");

	}

}
