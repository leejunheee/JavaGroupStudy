package JavaBasicQuiz;

import java.io.*;

class Quiz5_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = "";
		int kor, eng, mat;
		
		System.out.print("Input name : "); name = br.readLine();
		System.out.print("kor : "); kor = Integer.parseInt(br.readLine());
		System.out.print("eng : "); eng = Integer.parseInt(br.readLine());
		System.out.print("mat : "); mat = Integer.parseInt(br.readLine());
		
		
		int sum = kor + eng + mat;
		double avg = (double) sum / 3;

		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum);
		System.out.printf("평균점수 : %.1f", avg);
	}

}