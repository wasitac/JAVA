package item;

import java.util.HashMap;
import java.util.Map;

public class ItemBusinessRule {

	// field
	private static final Map<Long, Item> store = new HashMap<Long, Item>();
	private Long sequence = 0L;

	// method
	// 저장
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String itemName = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		Item item = new Item(itemName, price, quantity);

		item.setId(++sequence);
		store.put(sequence, item);
		System.out.println("상품 정보가 저장되었습니다.\n");
	}

	private Item findById(Long itemId) {
		Item item = store.get(itemId);
		return item;
	}

	// 조회
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		long itemId = ItemView.INPUT.nextLong();
		Item item = findById(itemId);
		if (item != null) {
			item.showInfo();
			System.out.println("상품 조회가 완료되었습니다.\n");
		} else {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n", itemId);
		}
	}

	// 수정
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		long itemId = ItemView.INPUT.nextLong();
		Item item = findById(itemId);
		if (item != null) {
			System.out.print("가격, 수량을 입력하세요...");
			Integer price = ItemView.INPUT.nextInt();
			int quantity = ItemView.INPUT.nextInt();

			store.get(itemId).setPrice(price);
			store.get(itemId).setQuantity(quantity);

			System.out.println("상품 수정이 완료되었습니다.\n");
		} else {
			System.out.printf("아이디가 %d인 상품이 없습니다.\n", itemId);
		}
	}

	// 삭제
	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요...");
		long itemId = ItemView.INPUT.nextLong();
		if (store != null) {
			store.remove(itemId);
			System.out.printf("%d번 상품이 삭제되었습니다.", itemId);
		} else {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.\n");
			return;
		}
		System.out.println("삭제가 완료되었습니다.\n");

	}

	// 상품 전체 조회
	public void findAll() {
		if (store.size() == 0) {
			System.out.println("저장된 상품 정보가 없습니다.\n");
			return;
		}
		for (int i = 1; i <= sequence; i++) {
			if (store.get((long) i) != null) {
				store.get((long) i).showInfo();
			}
		}
	}

	// 전체 삭제
	public void clearStore() {
		store.clear();
		System.out.println("상품의 모든 정보가 삭제되었습니다.\n");
	}
}
