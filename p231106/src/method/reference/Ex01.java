package method.reference;

/*
 [메서드 참조]
이중 콜론 연산자 ::

함수형 인터페이스를 람다식이 아닌 일반 메서드로 ‘참조’하여 선언하는 방법

즉, 컴파일러가 람다의 타입을 추론할 수 있도록 정보 제공하는 역할

- cf) anonymous class → functional interface → lambda expression → method reference expression

- functional interface는 abstract method가 1개
    
    (Single Abstract Method : SAM)
    
    @FunctionalInterface 어노테이션으로 보장
    
- 리턴 타입과 파라미터 타입이 동일한 “기존에 구현된” 메서드를 참조하면 더 간편하게 사용할 수 있음

- ‘기존에 정의된’ 메서드와 abstract method의 선언부가 완전히 같아야 함
    
    단, 메서드명과 관련(상관)없음 —> 메서드명이 달라도 됨
    
    ‘기존에 정의된 메서드’의 body를 사용하는 것이 핵심
    
    따라서, abstract method를 완전히 하나의 메서드로 호출 가능
    
- 참조 : 가리킨다 → 가리키는 역할
    
    참조만 하기에, 메서드명만 사용하고 파라미터의 ()는 제외
    
    즉, 주소만 사용
    
    ** 이미 정의된 다른 메서드의 body만 가져다 사용하는 형태 **
    

- 참조 가능한 메서드 : instance method, static method, constructor

- [문법]
    
    ```java
    // instance method
    1) 인스턴스::메서드명
    // static method
    2) 클래스명::메서드명
    // constructor
    3) 클래스명::new
    ```
  */
public class Ex01 {

}
