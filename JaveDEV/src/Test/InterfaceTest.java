package Test;

interface animals {
	public void eat(String bab);

	public void work(String move);

	public void sleep(String zzz);
}

class Cat implements animals {
	public void eat(String bab) {
		System.out.println("고양이는 " + bab + "을 먹어요.");
	}

	public void work(String move) {
		System.out.println("고양이는 " + move + "걸어요.");
	}

	public void sleep(String zzz) {
		System.out.println("고양이는 " + zzz + "자요.");
	}

}

class Monkey implements animals {
	public void eat(String bab) {
		System.out.println("원숭이는 " + bab + "을 먹어요.");
	}
	
	public void work(String move) {
		System.out.println("원숭이는 " + move + "걸어요.");
	}
	
	public void sleep(String zzz) {
		System.out.println("원숭이는 " + zzz + "자요.");
	}
}

class Chicken implements animals {
	public void eat(String bab) {
		System.out.println("닭은 " + bab + "을 먹어요.");
	}
	
	public void work(String move) {
		System.out.println("닭은 " + move + "걸어요.");
	}
	
	public void sleep(String zzz) {
		System.out.println("닭은 " + zzz + "자요.");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Monkey mo = new Monkey();
		Chicken ch = new Chicken();
		
		cat.eat("생선");
		mo.eat("바나나");
		ch.eat("사료");
		
		cat.work("네발로");
		mo.work("네발 또는 두발로");
		ch.work("두발로");
		
		cat.sleep("엎드려서");
		mo.sleep("누워서");
		ch.sleep("서서");
	}

}
