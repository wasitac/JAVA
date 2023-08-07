
public class StaticEx05 {
	// instance field
	int num;

	// static field
	static int var;

	// instance method (non-static method)
	void showNum() {
		System.out.println("num >> " + num);
	}

	static void showVar() {
		System.out.println("var >> " + var);
	}

	public static void main(String[] args) {
//		System.out.println("[main] num >> " + num); //error	
		System.out.println("[main method] var >> " + var);
		showVar();
		StaticEx05 s = new StaticEx05();
		s.showNum();
	}

}
