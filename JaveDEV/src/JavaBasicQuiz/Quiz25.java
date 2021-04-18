package JavaBasicQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//배열을 이용하여 날짜를 기억시킨 후 

//int []month={31,28,31,30,31,30,31,31,30,31,30,31};

//원하는 달 : 3

//3월은 31일입니다...
public class Quiz25 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 달 : ");
		int num = Integer.parseInt(reader.readLine());
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("%d월은 %d일입니다.",num,month[num-1]);
		
		
	}
}
