package JavaBasicQuiz;

import java.io.*;
class Quiz6_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bottom, height;
		
		System.out.println("*** 삼각형의 넓이 구하기 ****");
		System.out.print("밑변 : ");	bottom = Integer.parseInt(br.readLine());
		System.out.print("높이 : ");	height = Integer.parseInt(br.readLine());
		
		double area = (double)(bottom * height) / 2;
		System.out.printf("넓이 : %.2f", area);
	}

}
