package generic;

// 제네릭 인터페이스
interface InterfaceName<T> {}

// 제네릭 클래스
class ClassName<T>{}

class ClassSuper<T>{}

class ClassSub<K, V> {}

public class Ex04 {

	// 제네릭 메서드
	public static <T> void show(T t) {
		System.out.println(t);
	}
	
	/*[extends와 super] =========================================
	 * 1. 타입 중점
	 * <T extends 타입>	: 가능
	 * <T super 타입>		: 불가능
	 */
	public static <T extends ClassSuper>void one(T t) {}
//	public static <T super ClassSub>void two(T t) {}
	
	/* 2. 기능(동작) 중점
	 * : 타입보다는 기능(동작) 그 자체에 초점을 둔 메서드
	 * : 제네릭 인터페이스 또는 제네릭 클래스르 파라미터 타입으로 사용
	 * : ? 와일드 카드(unbounded wildcard)
	 * <? extends 타입>	: 가능
	 * <? super 타입> 	: 가능
	 * 
	 */
	public static void three(ClassName<?> args) {}
	public static void four(ClassName<? extends ClassSuper> args) {}
	public static void five(ClassName<? super ClassSuper> args) {}
	public static <T extends ClassName<?>> void six(T t) {}
	
	public static void main(String[] args) {

	}

}
