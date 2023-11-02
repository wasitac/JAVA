package inner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex09 {

	public static void main(String[] args) {
		// ArrayList 생성
		List<String> hangul = new ArrayList<String>();
		hangul.add("돌");
		hangul.add("바람");
		hangul.add("하늘");
		hangul.add("나비");
		System.out.println("정렬 전 : " + hangul);
		
		// [오름차순 정렬 1] Collections.sort()
		Collections.sort(hangul);
		System.out.println("정렬 후 : " + hangul);
		
		// cf) 내림차순 정렬
		Collections.sort(hangul, Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + hangul);
		
		// [오름차순 정렬 2] List.sort() : Java8 이후
		hangul.sort(Comparator.naturalOrder());
		System.out.println("오름차순 정렬 후 : " + hangul);
		hangul.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + hangul);
		
		// [오름차순 정렬 3] Comparator 인터페이스 구현
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// [오름차순]
				return o1.compareTo(o2);
				// [내림차순]
//				return o2.compartTo(o1);
			}
		};
	}

}
