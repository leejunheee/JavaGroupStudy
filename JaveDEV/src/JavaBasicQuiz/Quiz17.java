package JavaBasicQuiz;
//for 문을 이용하여 제곱승을 구하시오 
//x의 값을 입력하시오 : 3
//y의 값을 입력하시오 : 3
//3의 3승은 27

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int x,y;
		int result = 1;
		System.out.print("x의 값을 입력 : ");
		x = Integer.parseInt(br.readLine());
		System.out.print("y의 값을 입력 : ");
		y = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<y; i++) {
			result = result*x;
		}
		System.out.println(x+"의"+y+"제곱은"+result);
	}

}
