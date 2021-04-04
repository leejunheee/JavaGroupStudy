package JavaBasicQuiz;

import java.io.*;

/*
 값을 입력받아 함수호출하여 처리하시오

        조건1)입력받은 값을  compute(item, qty, price)함수에서 처리

        조건2)계산방법 : 금액 = 수량 * 단가
        
        -입력-
품명 : apple
수량 : 10
단가 : 1200

-출력-
품명 : apple
금액 : 12000원
 */
public class Quiz21 {
	public static void compute(String item, int num, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : "+(num*price ));
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String item;
		int price, num;
		
		System.out.print("품명 : "); item = reader.readLine();
		System.out.print("수량 : "); num = Integer.parseInt(reader.readLine());
		System.out.print("단가 : "); price = Integer.parseInt(reader.readLine());
		System.out.println();
		
		compute(item, num, price);
		

	}

}
