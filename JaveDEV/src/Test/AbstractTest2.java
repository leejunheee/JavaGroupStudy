package Test;
abstract class Cat2{
	void sleep() {
		System.out.println("야생에서는 눈에 띄지 않는 안전한 곳에서 잡니다.");
	}
	abstract void homesleep();
}

class BabyCat extends Cat2 {
	void homesleep() {
		System.out.println("집사 위에서 잔다.");
		System.out.println("침대 위에서 잔다.");
		System.out.println("책상 위에서 잔다.");
		System.out.println("노트북 위에서 잔다.");
	}
}
public class AbstractTest2 {

	public static void main(String[] args) {
		BabyCat bc = new BabyCat();
		bc.sleep();
		bc.homesleep();
		
	}

}
