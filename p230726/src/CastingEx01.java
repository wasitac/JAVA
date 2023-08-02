
public class CastingEx01 {

	public static void main(String[] args) {
		// 형변환
		// 리터럴 접미사 : F, L
		float fo = 2.34F;
		System.out.println("fo >>" + fo);
		
		long lo = 100000000000000L;
		System.out.println("lo >>" + lo);

		// 강제 형변환(명시적 형변환)
		int num = 65;
		byte by = (byte)num;
		System.out.println("by >> " + by);
		// 자동 형변환(묵시적 형변환)
		// 작은 크기 -> 큰 크기
		long longNum = num;
		System.out.println("longNum >> " + longNum);
		
		float floatNum = num;
		System.out.println("floatNum >> " + floatNum);
		
		short sh = -1;
		char ch = (char)sh;
		System.out.println("ch >> " + ch);
		System.out.println("sh >> " + sh);
	}

}
