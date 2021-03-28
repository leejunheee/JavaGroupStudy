package Test;

abstract class Cat1 { // 추상메서드를 포함하므로 추상클래스로 선언
	abstract void call(); //추상 메서드 선언 (구현x)
	void call2() {
		System.out.println("일반 메서드");
	}
}
//Cat 추상클래스를 상속한 클래스들 
class FirstCat extends Cat1 {
	void call() {//추상메서드는 서브클래스에서 반드시 재정의 되어야 함.
		System.out.println("첫번째 야옹이");
	}
}

class SecondCat extends Cat1 {
	void call() {
		System.out.println("두번째 야옹이");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		FirstCat fc = new FirstCat();
		SecondCat sc = new SecondCat();
		
		fc.call();
		sc.call();
		fc.call2();
		
	}

}
