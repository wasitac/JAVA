package enumtype;

import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("1.월, 2.화, 3.수, 4.목, 5.금, 6.토, 7.일");
		System.out.println("오늘의 요일을 선택하세요... ");
		
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		switch (day) {
		case 1: 
			System.out.println("월) 주간 회의");
			break;
		case 2: 
			System.out.println("화) 프로젝트 기획 회의");
			break;
		case 3: 
			System.out.println("수) 진행 사항 보고");
			break;
		case 4: 
			System.out.println("목) 사내 축구 시합");
			break;
		case 5: 
			System.out.println("금) 프로젝트 마감");
			break;
		case 6: 
			System.out.println("토) 가족과 즐거운 시간");
			break;
		case 7: 
			System.out.println("일) 휴일입니다.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}

}
