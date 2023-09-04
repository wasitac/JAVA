package item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemBusinessRule {

	// field
	private static final Map<Long, Item> store = new HashMap<Long, Item>();
	private static Long sequence = 0L;
	private final Scanner INPUT = ItemView.INPUT;

	// method
	public Item hasItem(long itemId) {
		Item item = store.get(itemId);
		if (item == null)
			System.out.printf("아이디가 %d인 상품이 없습니다.\n", itemId);
		return item;
	}
	
	// 저장
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String itemName = INPUT.next();
		
		for (Item item : store.values()) {
			if(item.getName().equals(itemName)) {
				System.out.println("같은 이름의 상품이 존재합니다.");
				INPUT.nextLine();
				return;
			}
		}
		
		Integer price = INPUT.nextInt();
		int quantity = INPUT.nextInt();

		Item item = new Item(itemName, price, quantity);
		item.setId(++sequence);
		store.put(sequence, item);
		System.out.println("상품 정보가 저장되었습니다.\n");
	}

	// 조회
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		long itemId = INPUT.nextLong();
		Item item = hasItem(itemId);
		if(item == null)
			return;
		
		item.showInfo();
		System.out.println("상품 조회가 완료되었습니다.\n");
	}

	// 수정
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		long itemId = INPUT.nextLong();
		Item item = hasItem(itemId);
		if(item == null)
			return;
		
		System.out.print("가격, 수량을 입력하세요...");
		Integer price = INPUT.nextInt();
		int quantity = INPUT.nextInt();
		item.setPrice(price);
		item.setQuantity(quantity);
		System.out.println("상품 수정이 완료되었습니다.\n");
	}

	// 삭제
	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요...");
		long itemId = INPUT.nextLong();
		Item item = hasItem(itemId);
		if(item == null)
			return;
		
		store.remove(itemId);
		System.out.printf("%d번 상품이 삭제되었습니다.", itemId);
		System.out.println("삭제가 완료되었습니다.\n");
	}

	// 상품 전체 조회
	public void findAll() {
		if (store.size() == 0) {
			System.out.println("저장된 상품 정보가 없습니다.\n");
			return;
		}
		for (Item item : store.values())
			item.showInfo();
	}

	// 전체 삭제
	public void clearStore() {
		store.clear();
		System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
	}
}
