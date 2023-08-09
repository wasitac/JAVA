/*
 * [상속 관계]
 * IS-A 관계
 * : ~는 ~이다.
 * : ex1) 학생은 사람이다 (O)
 * : ex2) 사람은 학생이다 (X)
 * 
 * HAS-A 관계 (소유/포함 관계)
 * : ~는(가) ~를 소유(포함)하고있다.
 * : ex1) 폰은 카메라를 포함하고 있다.(O)
 * : ex2) 카메라는 폰을 포함하고 있다.(X)
 * 
 * : ex1) 경찰이 총을 소유하고 있다.(O)
 * : ex2) 총이 경찰을 소유하고 있다.(X)
 */
class Gun{
	int bullet;
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}

//class Police extends Gun{
//	int handcuffs;
//	
//	public Police(int bnum, int bcuff) {
//		super(bnum);
//		handcuffs =bcuff;
//	}
//	public void puthandcuff() {
//		System.out.println("SNAP!");
//		handcuffs--;
//	}
//}

class Police{
	int handcuffs;
	Gun pistol;
	
	public Police(int bnum, int bcuff) {
		handcuffs = bcuff;
		if(bnum != 0)
			pistol = new Gun(bnum);
		else 
			pistol = null;
	}
	
	public void putHandcuff() {
		System.out.println("SNAP");
		handcuffs--;
	}
	
	public void shoot() {
		if(pistol == null)
			System.out.println("Hut BBANG!");
		else {
			pistol.shoot();
		}
	}
}
public class InheritanceEx03 {

	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
	}
 
}
