class Animal {
	//final field : 초기화한 값으로 값 고정 --> 값 변경 금지
	static final int COUNT = 5;
}
public class StaticEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("동물 몇마리 >> " + Animal.COUNT);
		//Animal.COUNT = 100; //error
	}

}
