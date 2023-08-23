import item.ItemBusinessRule;
import item.ItemView;

public class Main {

	public static void main(String[] args) {
		ItemBusinessRule rule = new ItemBusinessRule();
		outer:
		while (true) {
			ItemView.showMenu();
			int select = ItemView.INPUT.nextInt();
			
			switch (select) {
			case 1:
				rule.save();
				break;
			case 2:
				rule.find();
				break;
			case 3:
				rule.update();
				break;
			case 4:
				rule.delete();
				break;
			case 5:
				rule.findAll();
				break;
			case 6:
				rule.clearStore();
				break;
			case 7:
				break outer;

			default:
				System.out.println("1~7 사이의 숫자를 입력하세요");
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}
}
