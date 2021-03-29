package JavaBasicQuiz;
/* 입력된 문자가 대문자이면 소문자로 출력하고
        소문자이명 대문자로 변환하여 출력하시오
        그외의 문자이면 "입력데이타오류"라고 표시하시오
        (if-else문 이용)   */
import java.io.*;
public class Quiz9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		
		System.out.print("Input Character : ");
		ch = br.readLine().charAt(0);

		if (ch>= 'A' && ch <= 'Z') 
			System.out.println("result :" + (char)(ch+32));
		else if (ch>= 'a' && ch<='z')
			System.out.println("result :" + (char)(ch-32));
		else 
			System.out.println("입력데이터 오류");
			
	}

}
