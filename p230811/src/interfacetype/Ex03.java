package interfacetype;

interface Method {
	void one();
	public abstract void two();
}

class Sub implements Method {
	@Override
	public void one() {
		System.out.println("[Sub class] 오버라이딩된 메서드 one() 실행됨");
	}
	
	@Override
	public void two() {
		System.out.println("[Sub class] 오버라이딩된 메서드 one() 실행됨");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		
	}

}
