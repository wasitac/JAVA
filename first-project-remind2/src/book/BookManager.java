package book;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// HashSet
public class BookManager {
	public static Scanner input = new Scanner(System.in);
	public Set<AnimalInfo> infoStorage = new HashSet<>();
	
	// [요소 추가] ----------------------------------------------
	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		AnimalInfo searchInfo = search(name);
		
		if(searchInfo != null) {
			System.out.println("이미 저장된 이름입니다.");
			return;
		}
		
		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	// [삭제] ----------------------------------------------------
	public void deleteData() {
		// 이름을 입력 받은 후, 삭제
		// 있으면 삭제 후 '데이터 삭제 완료' 출력
		// 없으면 문구 출력 : 해당 데이터는 없습니다.
		System.out.print("삭제할 이름을 입력하세요...");
		String deleteName = input.next();
		
		AnimalInfo searchInfo = search(deleteName);
		
		if(searchInfo == null) {
			System.out.println("해당 데이터가 없습니다.");
			return;
		} 
		infoStorage.remove(searchInfo);
		System.out.println("데이터 삭제가 완료되었습니다.");
	}
	
	// [검색] ---------------------------------------------------
	public void searchData() {

		System.out.print("검색할 이름을 입력하세요...");
		String searchName = input.next();
		
		AnimalInfo searchInfo = search(searchName);
		
		if(searchInfo == null) {
			System.out.println("해당 데이터는 없습니다.");	
			return;
		}
		
		searchInfo.showAnimalInfo();
		System.out.println("데이터 검색이 완료되었습니다.");
	}
	
	public void updateData() {
		System.out.print("수정할 이름을 입력하세요...");
		String updateName = input.next();
		
		System.out.print("나이를 입력하세요...");
		int updateAge = input.nextInt();
		
		AnimalInfo searchInfo = search(updateName);
		
		if(searchInfo == null) {
			System.out.println("해당 데이터는 없습니다.");
			return;
		}
		
		searchInfo.setAge(updateAge);
		System.out.println("데이터 수정이 완료되었습니다.");
	}
	
	private AnimalInfo search(String name) {
		for (AnimalInfo info: infoStorage) {
			if(info.getName().equals(name))
				return info;
		}
		return null;
	}	
	
	// [요소 출력] --------------------------------------------
	public void showBook() {
		for(AnimalInfo animalInfo: infoStorage)
			animalInfo.showAnimalInfo();
				
	}
}