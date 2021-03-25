package CH7;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine2 fe =  new FireEngine2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car2) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
	}

}//class
class Car2 {}
class FireEngine2 extends Car2 {}
// FireEngine은 Object클래스와 Car 클래스를 포함.