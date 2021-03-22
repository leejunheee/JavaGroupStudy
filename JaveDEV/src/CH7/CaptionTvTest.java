package CH7;

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUP() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	boolean caption; //캡션상태 (on/off)
	void displayCaption(String text) {
		if(caption) { //캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 조상 클래스로부터 상속받은 멤버
		ctv.channelUP(); // 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World1");
		ctv.caption = true; //캡션기능을 켠다.
		ctv.displayCaption("Hello World2"); // 캡션기능을 화면에 보여준다.
	}

}
