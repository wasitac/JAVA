package book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookService {
	private static final Map<Long, Animal> store = new HashMap<>();
	private static Long sequence = 1L;
	private Scanner sc = MenuView.sc;

	public void input() {
		System.out.println("이름과 나이를 입력하세요...");
		System.out.print("동물명: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		store.put(sequence, new Animal(name, age));
		store.get(sequence).setId(sequence++);
	}

	private Animal findById(Long id) {
		if (store.containsKey(id))
			return store.get(id);
		
		return null;
	}

	public void search() {
		System.out.print("[조회] 회원 아이디 입력...");
		Long id = sc.nextLong();
		Animal animal = findById(id);
		
		if (animal == null) {
			System.out.printf("아이디가 %d인 고객이 없습니다.\n", id);
			return;
		}
		
		animal.showInfo();
		System.out.println("고객 정보 조회가 완료되었습니다.");
	}

	public void update() {
		System.out.print("[수정] 회원 아이디 입력...");
		Long id = sc.nextLong();
		Animal animal = findById(id);
		
		if (animal == null) {
			System.out.printf("아이디가 %d인 고객이 없습니다.\n", id);
			return;
		}
		
		System.out.print("\n이름과 나이를 입력하세요...");
		String name = sc.next();
		int age = sc.nextInt();
		animal.setName(name);
		animal.setAge(age);

	}

	public void delete() {
		System.out.print("[삭제] 회원 아이디 입력...");
		Long id = sc.nextLong();
		Animal animal = findById(id);
		
		if (animal == null) {
			System.out.println("해당 고객 정보가 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		
		store.remove(id);
		System.out.printf("%d번 고객 정보가 삭제되었습니다.\n", id);
	}

	public void print() {
		int size = store.size();
		System.out.printf("\n전체 회원 동물수 : %d\n", size);
		
		if (size == 0) {
			System.out.println("저장된 상품 정보가 없습니다.");
			return;
		}
		
		for (Animal animal : store.values())
			animal.showInfo();
	}

	public void clearStore() {
		store.clear();
		System.out.println("모든 고객 정보가 삭제되었습니다.");
	}
}
