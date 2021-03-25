package Test;

public class Champion {
	int hp;
	int mp;
	
	Champion(){
		hp =500;
		mp=300;
	}
	
	void HpDamage (int h) {
		hp = hp -h ;
	}
	void MpUse (int m) {
		mp = mp - m;
	}
	
	static void what() {
		System.out.println("챔피언 클래스는 게임 캐릭터를 의미한다.");
	}

	public static void main(String[] args) {
		Champion c = new Champion ();
		System.out.print("현재 hp :"+c.hp);
		System.out.print(" 현재 mp :"+c.mp);
		c.HpDamage(50);
		c.MpUse(40);
		System.out.println();
		System.out.print("현재 hp :"+c.hp);
		System.out.print(" 현재 mp :"+c.mp);
		System.out.println();
		Champion.what();
		
	}

}
