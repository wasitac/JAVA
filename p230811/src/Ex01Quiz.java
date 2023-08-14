
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
	int index = 0;
	Product[] myProducts = new Product[10];

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("돈이 부족해서 구입할 수 없어요");
			return;
		}

		myProducts[index++] = p;
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다");
	}

	void summry() {
		int use = 0;
		String itemList = "";

		// for문
//		for (int i = 0; i < index; i++) {
//			use += myProducts[i].price;
//			itemList = itemList.concat(myProducts[i].toString() + (", "));
//		}
//		System.out.println("구입하신 물품의 총금액은 " + use + "만원입니다");
//		System.out.print("구입하신 제품은 " + itemList + "입니다.");

		// 향상된 for문
		for (Product p : myProducts)
			if (p != null) {
				use += p.price;
				itemList = itemList.concat(p.toString() + ", ");
			}

		System.out.println("구입하신 물품의 총금액은 " + use + "만원입니다");
		System.out.print("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ex01Quiz {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
//		b.refund();
		b.buy(new Tv());
		b.summry();

	}

}
