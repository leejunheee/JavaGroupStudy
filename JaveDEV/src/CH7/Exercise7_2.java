package CH7;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

	SutdaDeck2() {
		// 배열 SutdaCard를 적절히 초기화.
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			// i의 값이 0~19까지 변하는 동안 우리가 원하는 num의 값을 얻기 위해 사용.
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

			cards[i] = new SutdaCard2(num, isKwang);

		}

	}
	void shuffle() {
		for(int x=0; x<cards.length*2;x++) {
			//배열 index범위 내의 임의의 두값을 얻는다.
			int i = (int)(Math.random()*cards.length);
			int j = (int)(Math.random()*cards.length);
			
			//cards[i] 와 cards[j]의 값을 서로 바꾼다.
			SutdaCard2 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	SutdaCard2 pick(int index) {
		if(index <0 ||index >=CARD_NUM)//index의 유효성 검사.
			return null;
		return cards[index]; 
		
	}
	SutdaCard2 pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index); // 	pick(int index)를 호출.
		
	}
}

class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_2 {

	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());

		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
