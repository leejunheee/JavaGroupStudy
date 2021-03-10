package CH4;

public class FlowEx6 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*10) + 1;
  
		switch(score*100) {
		case 100 :
			System.out.println("당신점수 100, 상품 자전거");
			break;
		case 200 :
			System.out.println("당신점수 200, 상품 tv");
			break;
		case 300 :
			System.out.println("당신점수 300, 상품 노트북");
			break;
		case 400 :
			System.out.println("당신점수 400, 상품 자동차");
			break;
		default :
			System.out.println("상품 없음");
		}

	} 
}
