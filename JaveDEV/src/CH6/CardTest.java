package CH6;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade"; // 인스턴스변수의 값을 변경.
		c2.number = 4;

		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2는" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경.");
		c1.width = 50; // 클래스 변수의 값을 변경.
		c1.height = 80; 
		//Card.width 
		//Card.height 로 하는게 덜 헷갈림.
		
		// c2를 따로 변경안해도 공유변수기 때문이 같이 바뀜.

		System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2는" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");

	}

}

class Card {
	String kind; // 카드의 무늬 - 인스턴스 변수
	int number; // 카드의 숫자 - 인스턴스 변수
	static int width = 100; // 카드의 폭 - 클래스 변수
	static int height = 250; // 카드의 높이 - 클래스 변수
}
