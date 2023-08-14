import interfacetype.Hell;

class SubMethod implements Hell {

	@Override
	public void one() {
	}

	@Override
	public void two() {
	}
	
	
	
}
public class InterfaceMethodModifier {
	public static void main(String[] args) {
		 SubMethod sm = new SubMethod();
		 Hell.staticMethod();
		 
	}
}
