
class Thing{
	int num;
	
	void show() {
//		int var = 100;
		System.out.println("참조변수 this >> " + this);
		System.out.println("멤버변수 num >> " + num);
		System.out.println("멤버변수 num >> " + this.num);
//		System.out.println("지역변수 var >> " + this.var); // error!
	}
}

public class InstanceEx02 {

	public static void main(String[] args) {
		
		Thing one = new Thing();
		Thing two = new Thing();
		System.out.println("참조변수 two 저장된 주소 > " + two);
		System.out.println("참조변수 one 저장된 주소 >> " + one);
		
		//외부접근
		System.out.println("[외부접근] 멤버 변수 num 접근 >> " + one.num);
		one.show();
	}

}
