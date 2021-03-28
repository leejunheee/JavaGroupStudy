package JavaBasicQuiz;
//급여명세서를 작성.
//조건1 : 기본급이 1500000원, 수당 55000원 세금은 기본급의 10%
//조건2 : 실수령액 = 기본급 + 수당 - 세금

public class Quiz3 {

	public static void main(String[] args) {
		/* int a =1500000;
		int b = 55000;
		float c = a * 0.1f;*/
		int pay = 1500000;
		int timepay =55000;
		double tax = 0.1;
		int resultPay = pay + timepay - (int)(pay*tax);
		
		
		System.out.println("실수령액="+ resultPay);
		
	}

}
