package generic;

class Parent<T> {
	T item;
	
	public Parent() {}
	
	public Parent(T item) {
		this.item = item;
	}
}

class Child<T> extends Parent<T>{
	private T num;
	
	
	public void show(T t) {
		System.out.println(t);
	}
	
	// generic method
	public <E> void showType(E e) {
		System.out.println(e);
	}
}
public class Ex07 {
	public static void main(String[] args) {
		
		Child<String> c = new Child<String>();
		c.show("안녕");
		
		Child<Pen> pen = new Child<Pen>();
		
		pen.showType(new Tree());
		pen.<Tree>showType(new Tree());
	}
}
