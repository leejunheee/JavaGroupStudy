package CH6;
class Tv1 { 
	//tv의 속성 (멤버변수)
	String color; //색상
	boolean power; //전원상태 온/오프
	int channel; //채널
	
	//tv의 기능(메서드)
	void power() { power = !power; } // tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; } // 채널을 높이는 기능
	void channelDown() { --channel; } // 채널을 낮추는 기능
}

public class TvTest3 {

	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		System.out.println("t1의 channel값"+t1.channel+"입니다.");
		System.out.println("t2의 channel값"+t2.channel+"입니다.");
		
		t2= t1; //t1이 저장하고 있는 값(주소)을 t2에 저장
		t1.channel = 7;
		System.out.println("t1의 channel을 값을 7로 변경하였다.");
		
		System.out.println("t1의 channel값"+t1.channel+"입니다.");
		System.out.println("t2의 channel값"+t2.channel+"입니다.");
	}

}
