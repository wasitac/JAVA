import area.CircleArea;
import per.CirclePerimeter;

public class Circle {

	public static void main(String[] args) {
		CircleArea c1 = new CircleArea(1.5);
		System.out.println("원 넓이 >> " + c1.getArea());
		
		CirclePerimeter c2 = new CirclePerimeter(1.5);
		System.out.println("원 둘레 >> "+ c2.getPerimeter());
	}

}
