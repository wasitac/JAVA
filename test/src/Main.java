import book.BookService;
import book.MenuView;

public class Main {

	public static void main(String[] args) {
		int select = 0;
		BookService book = new BookService();
		while (select != 7) {
			MenuView.showMenu();
			select = MenuView.sc.nextInt();
			switch (select) {
			case 1:
				book.input();
				break;
			case 2:
				book.search();
				break;
			case 3:
				book.update();
				break;
			case 4:
				book.delete();
				break;
			case 5:
				book.print();
				break;
			case 6:
				book.clearStore();
				break;
			}
		}
	}

}
