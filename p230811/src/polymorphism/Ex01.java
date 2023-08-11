package polymorphism;

class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Computer extends Product {

	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}

}

class Tv extends Product {

	public Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("돈이 부족해서 구입할 수 없어요");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다");
		System.out.println("모은 포인트는 " + b.bonusPoint + "점입니다");
	}

}
