// Fruit class 정의================================
class Fruit {
	//멤버 변수
	int count;
	String sort;
	
	//setter
	void setCount(int count) {
		this.count = count;
	}
	
	//getter
	int getCount() {
		return this.count;
	}
	//멤버 메서드
	void showInfo() {
		String sort = "사과"; // 지역변수
		System.out.println("과일 종류 : " + sort);
		System.out.println("과일 개수 : " + count);
		System.out.println("===================\n");
	}
}

public class InstanceEx01 {

	public static void main(String[] args) {
		//객체생성
		Fruit fruit = new Fruit();
		fruit.showInfo();
		
		fruit.setCount(5);
		fruit.showInfo();
		System.out.println("과일 개수 : getter >> " + fruit.getCount());
	}

}
