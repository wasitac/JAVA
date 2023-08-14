package interfacetype;

public interface Hell {
	void one();
	public abstract void two();
	
	//default method : java 8 버전부터 지원됨
	// interface에서 default는 접근제한자가 아니라 바디가 있는 메서드를 정의 할 때 사용한다. 
	// 실제 접근 범위는 public이다
	public default void defaultMethod() {
		System.out.println("[Method interface] default 멤버 메서드");
	}
	
	// static method : java 8 버전부터 지원됨
	// 실제 접근 범위는 public이다 
	static void staticMethod() {
		System.out.println("[Method interface] static 멤버 메서드");
	}
}