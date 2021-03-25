package CH7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe= null;
		
		car.drive();
		fe = (FireEngine)car;
		car2 = fe;
		car2.drive();
	}

}
