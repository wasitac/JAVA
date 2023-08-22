package generic;

class Cool<T> {
	T count;
	// [과제] 제네릭 배열 생성은 불가능
	// 공변(covariant), 불공변, 반공변
	// SOLID
	
	/*
	   배열은 공변하며 런타임에 실체화 되지만, 제네릭 타입은 불공변하며 런타임에 소거됩니다.
	   이로 인해 배열은 타입 안전성을 보장해줄 수 없어 제네릭 배열을 직접 생성할 수 없습니다.
	   타입 안전성을 위해서라면 배열을 사용하기 보다 제네릭 타입을 활용한 리스트를 사용하는 것이 좋습니다.
	 */
//	T[] arr = new T[10];

	public Cool(T[] arr) {
		this.arr = arr;
	}
	
	
}

public class Ex09 {

	public static void main(String[] args) {

	}

}
