class Super {
	// field ===================
	int num;

	// constructor =============
	// 상속받는 자식을 고려해 필요하지 않아도 기본 생성자를 생성해 둔다
	Super() {
	}

	Super(int num) {
		this.num = num;
	}
}

class Sub extends Super {
	/*
	 * default constructor ===== public Sub() { super(); }
	 */
}

public class InheritanceEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
