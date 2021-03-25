package CH7;

class Product2 {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스점수
	
	Product2 (int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
	
	Product2(){
		price=0;
		bonusPoint =0;
	}
}
class Tv3 extends Product2 {
	Tv3 (){
		//조상클래스의 생성자 Product(int price)를 호출
		super(100); // Tv의 가격을 100만원으로 한다.
	}
	
	public String toString () { // Object클래스의 toString를 오버라이딩.
		return "Tv" ;
	}
}

class Computer2 extends Product2 {
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product2 {
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer2 { // 고객
	int money = 1000; // 소유금액
	int bonusPoint = 0; //보너스점수
	Product2[] item = new Product2[10];
	int i =0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price; // 가진돈에서 구입한 제품의 가격을 뺀다,
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가.
		item[i++] = p;
		System.out.println(p +"을 구입하셨습니다.");
	}
	
	void summary() {
		int sum =0;
		String itemList = "";
		
		for(int i=0; i <item.length;i++) {
			if(item[i]==null) break;
			sum =sum+ item[i].price;
			itemList = itemList + item[i]+ ", ";
		}
		System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다.");
		System.out.println("구입하신 제품은"+itemList+"입니다.");
	}
}
public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv3 tv = new Tv3();
		Computer2 com = new Computer2();
		Audio audio = new Audio();
		
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
		
		//System.out.println("현재 남은 돈은" + b.money + "만원입니다.");
		//System.out.println("현재 보너스 점수는" + b.bonusPoint + "점입니다.");
	}

}
