package study;

import java.util.ArrayList;

public class Main {
	static ArrayList<String> s = new ArrayList<>();
	public static void main(String[] args) {
		s.add("지홍");
		s.add("은지");
		System.out.println(s.get(0).equals("지홍"));
	}
}
