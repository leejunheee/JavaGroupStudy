package CH6;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		// isPowerOn의 값이 ture 면 false로 , false면 true로 바꿈.
		isPowerOn =!isPowerOn;
	}

	void volumeUp() {
		// volume값이 맥스 볼륨보다 작을때만 값을 1 증가.
		if(volume<MAX_VOLUME) {
			volume++;
		}
	}

	void volumeDown() {
		// volume값이 MIN 볼륨보다 클때만 값을 1 감소.
		if(volume>MIN_VOLUME)
			volume--;
	}

	void channelUp() {
		// channel값을 1 증가.
		// 만일 channel 이 max channel이면 channel값을 min channel로 바꿈.
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
	}

	void channelDown() {
		// channel값을 1 감.
		// 만일 channel 이 min channel이면 channel값을 max channel로 바꿈. }
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
	}
}//class MyTv

public class Exercise6_21 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL :"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL :"+t.volume);
		
		t.volume = 100;
		t.channelUp(); 
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL :"+t.volume);
		
		
	}

}
