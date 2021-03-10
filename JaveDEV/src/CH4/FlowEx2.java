package CH4;

public class FlowEx2 {

	public static void main(String[] args) {
		int visitCount = 5;
		if(visitCount < 1) { 
			System.out.println("처음,감사.");
		} else {
			System.out.println("다시, 감사");
		}
		System.out.println("방문횟수" + ++visitCount + "번");

	}

}
