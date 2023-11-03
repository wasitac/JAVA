package lambda;

@FunctionalInterface
interface Box {
	public String boxing();
}

class Banana {
	public Banana() {
		System.out.println("\n[constructor] 나는 바나나입니다.");
	}

	public void buy(Box box) {
		System.out.println(box.boxing());
	}

	// 익명 클래스를 리턴값에 사용
//	public Box change() {
//		return new Box() {
//			@Override
//			public String boxing() {
//				return "새 바나나 박스로 교환합니다.";
//			}
//		};
//	}
	// 람다식을 리턴값에 사용
	public Box change() {
		return () -> "[람다] 새 바나나 박스로다가 교환을";
	};
}

public class Ex02 {
	public static void main(String[] args) {
		// [익명 클래스]
		// 1. 객체 생성
		Banana banana = new Banana();

		// 2-1. 익명 클래스로 생성된 객체를 참조변수에 저장
		Box box = new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 바나나를 박스에 담아요~";
			}
		};
		banana.buy(box);

		banana.buy(new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 바나나를 포장합니다";
			}
		});

		Banana lambda = new Banana();
		// 2-1. 람다식을 참조변수에 저장
		Box lambdaBox = () -> "[람다] 바나나를 박스에 담아요~";
		lambda.buy(lambdaBox);
		
		// 2-2.람다식을 인수에 사용
		lambda.buy(()-> "[람다] 바나나를 포장합니다.");
		//출력
		lambda.buy(lambda.change());
	}
}
