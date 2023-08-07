class Item {
	// field
	int year;
	String name;
	final String company;

	// constructor
	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}

	// setter는 초기화가 아닌 값 변경이 목적이기 때문에 final을 setter에서 초기화 할 수는 없다
//	void setCompany(String company) {
//		this.company = company;
//	}

	// method
	void showinfo() {
		System.out.println("생산년도 : " + this.year);
		System.out.println("제품명 : " + this.name);
		System.out.println("제조회사 : " + this.company);
	}

}

public class FinalEx02 {

	public static void main(String[] args) {
		Item item = new Item(2022, "곰돌이", "다이소");
		item.showinfo();

		System.out.println("\n<< 제조회사 변경 후 >>");
//		item.setCompany("아트박스");
		item.showinfo();
		
		Item item2 = new Item(2023, "곰순이", "이마트");
		item2.showinfo();
//		item2.company = "하이마트";	
	}

}
