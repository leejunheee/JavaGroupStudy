package CH7;

	
class Car { 
	String color ;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	void stop () {
		System.out.println("stop!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!");
	}
}

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null; //Car타입의 참조변수 car를 선언하고 null로 초기화
		FireEngine fe = new FireEngine(); //
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //참조변수 fe가 참조하고 있는 인스턴스를 참조변수 car가 참조하도록함.
		//fe의 값이 car에 저장.
		//car.water();
		fe2 = (FireEngine)car;//참조변수 car가 참조하고 있는 인스턴스를 참조변수 fe2가 참조.
		//이때 두 참조변수의 타입이 다르므로 참조변수 car를 형변환.
		fe2.water();
		
		
	}

}
