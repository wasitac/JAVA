package generic;

class Wrap<T> {
	T item;
	public void wrap(T item) {
		this.item = item;
	}
	
	public T unwrap() {
		return this.item;
	}
}

public class Ex06 {
	public static void unwrapGift(Wrap<? super Pen> wrap) {
		//왜 super를 사용할 때는 형변환이 필요하다고?
		Thing thing = (Thing)wrap.unwrap();
		System.out.println("선물 개봉합니다.");
		
		
	}
	public static void main(String[] args) {
		Wrap<Pen> pen = new Wrap<Pen>();
		unwrapGift(pen);
	
//		Wrap<Tv> tv = new Wrap<Tv>();
//		unwrapGift(tv);
		
		//Thing
		Wrap<? super Pen> wrap = new Wrap<Thing>();
		Wrap<? super Pen> wrap2 = new Wrap<Object>();
		unwrapGift(wrap);
	}

}
