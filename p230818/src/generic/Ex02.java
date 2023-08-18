package generic;

class Test<T> {
	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		Test<Integer> one = new Test<Integer>();
		one.setElement(10);
		//boxing/unboxing은 명시적으로 변환하는 일이 없게 코드를 작성하는게 좋다.
		System.out.println("설정된 값 >> " + one.getElement());
		
		//작동은 되는데 추정해서 넣어준거지 원래는 위처럼 작성하는거임. 근데 이렇게 많이 사용함
		Test<String> two = new Test();
		two.setElement("안녕");
		System.out.println("설정된 값 >> " + two.getElement());
	}

}
