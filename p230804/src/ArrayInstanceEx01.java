class Student {

	// field
	int age;
	String name;

	// constructor
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// method
	void showInfo() {
		System.out.println("나이 : " + this.age);
		System.out.println("이름 : " + this.name);
		System.out.println("===================\n");
	}

}

public class ArrayInstanceEx01 {

	public static void main(String[] args) {
		// [객체 배열] : 1차원 배열
		// 타입[] 배열명 = new 타입[길이]
		Student[] smart = {
				new Student(26, "hong"), 
				new Student(32, "park"), 
				new Student(55, "lee")
				};
		
		
//		System.out.println("smart >> " + smart);
//		System.out.println("smart[0] >> " + smart[0]);

//		smart[0] = new Student(26, "hong");
//		smart[1] = new Student(32, "park");
//		smart[2] = new Student(55, "lee"); 

//		smart[0].showInfo();
//		smart[1].showInfo();
//		smart[2].showInfo();

		// for
//		for (int i = 0; i < smart.length; i++)
//			smart[i].showInfo();

		// 향상된 for
		for (Student student : smart)
			student.showInfo();
	}

}
