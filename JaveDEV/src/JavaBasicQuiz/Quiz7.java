package JavaBasicQuiz;
//BufferedReader를 이용하여 입력받아 두수 중 큰수 출력, 삼항연산자 이용
import java.io.*;
class Quiz7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		
		System.out.println("*** 더 큰수 구하기 ****");
		System.out.print("Input a : ");	a = Integer.parseInt(br.readLine());
		System.out.print("Input b : ");	b = Integer.parseInt(br.readLine());
		
		int c = (a > b) ? a : b;
		System.out.println("큰수 : "+ c);
	}

}