package study;

class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {}

	public static Singleton getS() {
		return s;
	}
	
}

public class Main2{
	public static void main(String[] args) {
		Singleton i = Singleton.getS();
	}
}