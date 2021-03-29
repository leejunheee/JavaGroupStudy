package JavaBasicQuiz;
//값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!" 출력 
import java.io.*;

public class Quiz8 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		
		System.out.print("점수입력 : ");
		a = Integer.parseInt(br.readLine());

		if (a<0 || a >100) 
			System.out.println("입력오류!!");
		else 
			System.out.println("입력된값 :"+ a);
			
	}

}