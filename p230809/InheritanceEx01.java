class Super {
	void one() {
		System.out.println("one() 실행됨");
	}
	void two() {
		System.out.println("two() 실행됨");
	}
}

class Sub extends Super {
	@Override
	void one() {
		System.out.println("오버라이딩 된 메서드 one() 실행됨");
	}

	@Override
	void two() {
		System.out.println("오버라이딩 된 메서드 two() 실행됨");
	}
	
	
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
