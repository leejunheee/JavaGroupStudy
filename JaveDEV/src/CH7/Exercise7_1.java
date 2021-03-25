package CH7;
/* 섯다카드 20장을 포함하는 섯다카드 한벌을 정의. 섯다카드 20장을 담는 SutdaCard배열을 초기화
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 숫자가 1,3,8인 경우
 * 둘 중 한 장은 광이어야 한다. 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true.
 */
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM] ;
	
	SutdaDeck() {
		//배열 SutdaCard를 적절히 초기화.
		for(int i =0; i<cards.length;i++) {
			int num = i%10+1;
			//i의 값이 0~19까지 변하는 동안 우리가 원하는 num의 값을 얻기 위해 사용.
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);	
			
			cards[i] = new SutdaCard(num,isKwang);
			
		}
		
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	//info()대신 Object클래스의 toString()을 오버라이딩.
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}
public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i =0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}

}
