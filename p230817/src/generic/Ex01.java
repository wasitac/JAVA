package generic;
/*
 *  [Generic] 제네릭 =======================================
 *  : type을 일반화(generalize)
 *  : type은 컴파일 할 때 결정
 *  : generic은 type을 외부에서 결정(지정)
 *  : JDK 1.5 버전부터 도입(지원) enum도 그런데. JDK1.5버전은 대체 뭐였을까
 *  
 *  -----------------------------------------------------------
 *  타입         설명
 *  <T>			type
 *  <E>			Element
 *  <K>			Key
 *  <V>			Value
 *  <N>			Number
 *  ======================================================
 */

// 타입 (매개)변수 
// 타입 파라미터 
// 제네릭 파라미터 <T>
class Test<T> {
	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}

public class Ex01 {

	public static void main(String[] args) {
		Test<Integer> one = new Test<Integer>();
		one.setElement(5);
		System.out.println(one.getElement());

		Test<String> two = new Test<String>();
		two.setElement("안녕");
		System.out.println(two.getElement());
	}

}
