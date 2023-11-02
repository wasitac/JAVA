package lambda;

/*
 * [람다 표현식] 람다식, 람다, lambda expression
 * : Java 8부터 함수형 프로그래밍 지원을 위해 Lambda, Stream 도입
 * : 메서드를 하나의 식으로 표현
 * : lambda는 익명 함수(anonymous function)를 의미 -> 메서드명 없음
 * : 사실상 객체로 관리
 * 
 * << 특징 >>
 *  - 메서드명과 반환형 생략, return 키워드 대신 식(expression) 사용
 *  - 람다식 내 지역변수 final
 *  
 *  << 장점 >>
 *  - 코드 간결
 *  - 가독성 높아짐
 *  - 메서드 정의 없이 한번에 처리 가능하므로 생산성 높아짐
 *  
 *  << 단점 >>
 *  - 디버깅 어려움
 *  - 재귀로 부적합
 *  
 *  << syntax >>
 *  [형태 1]
 *  () -> expression
 *  
 *  [형태 2]
 *  (parameter) -> expression

 *  [형태 3]
 *  (parameter, para2) -> {
 *  	code;
 *  	code;
 *  	return 값;
 *  }
 *  
 *  () : parameter - 메서드의 매개변수
 *  -> : arrow	   - {} 실행
 *  {} : body	   - 메서드의 바디
 *  
 *  << 활용 >>
 *  1. 참조변수에 람다식을 저장
 *  2. return
 *  3. 인수
 */
public class Ex01 {

	public static void main(String[] args) {
		
	}

}
