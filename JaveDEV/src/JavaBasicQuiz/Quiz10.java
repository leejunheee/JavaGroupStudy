package JavaBasicQuiz;

//4개의값을 콘솔에서 입력받아 처리 
import java.io.*;
public class Quiz10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name ;
		String gender ;
		int age;
		double tall;

		System.out.print("Input name : "); name = br.readLine();
		System.out.print("Input gender : "); gender = br.readLine();
		System.out.print("Input age : "); age = Integer.parseInt(br.readLine());
		System.out.print("Input tall : "); tall = Double.parseDouble(br.readLine());

		
		String c = (gender == "M") ? "남자" : "여자";

		System.out.println("이름 : " + name);
		System.out.println("성별 : " + c);
		System.out.println("나이 : " + age +"세");
		System.out.printf("신장 : %.1fcm", tall);
	}

}
