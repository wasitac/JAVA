class Robot {
	// 멤버 변수 : field
	// - 인스턴스 변수(객체 변수)
	int productYear;
	String productName;

	// setter/getter
	public int getProductYear() {
		return productYear;
	}

	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}

public class InstanceEx07 {
	//리턴형 : 참조형 -> 리턴값 : 참조 변수
	public static Robot constructRobot(int year, String name) {
		Robot robot = new Robot();
		robot.setProductYear(year);
		robot.setProductName(name);
		return robot;
	}

	public static void main(String[] args) {
		// 지역 변수 : local variable
		Robot robot = constructRobot(2003, "페퍼");
//		System.out.println("참조변수 robot에 저장된 주소 >> " + robot);
		System.out.println("robot 생산년도 > " + robot.getProductYear());
		System.out.println("robot 제품명 >> " + robot.getProductName());

		Robot robot2 = constructRobot(2007, "아틀라스");
//		System.out.println("참조변수 robot2에 저장된 주소 >> " + robot2);
		System.out.println("robot 생산년도 >> " + robot2.getProductYear());
		System.out.println("robot 제품명 >> " + robot2.getProductName());
	}

}
