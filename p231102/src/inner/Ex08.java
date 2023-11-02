package inner;

interface Box {
	public void boxing();
}

class Banana {
	public Banana() {
		System.out.println("[Banana] 바나나는 멸종위기 입니다.");
	}
	
	public void buy(Box box) {
		box.boxing();
	}
}
public class Ex08 {

	public static void main(String[] args) {
		// 1. 객체 생성 
		Banana banana = new Banana();
		
		// 2. [Anonymous class] 인수
		banana.buy(new Box() {
			@Override
			public void boxing() {
				System.out.println("바나나를 포장합니다.");
			}
		});
	}

}
