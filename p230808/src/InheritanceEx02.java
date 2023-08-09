/*
 * Object 클래스는 모든 클래스의 최상위 부모 클래스
 */
class Student {
	// << method overriding >>
	// 메서드 재정의
	public String toString() {
		System.out.println("<< 재정의된 메소드 toString 실행됨 >>");
		return "Student 클래스입니다.";
	}
}

public class InheritanceEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student);
		System.out.println(student.toString());
	}

}
