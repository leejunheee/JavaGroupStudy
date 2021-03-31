package JavaBasicQuiz;

import java.io.*;

public class Quiz12_again {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mid, fin, report, attend;
		double score;
		char grade;
		String app = null;
		
		System.out.println("중간고사를 입력 :"); mid = Integer.parseInt(br.readLine());
		System.out.println("기말고사를 입력 :"); fin = Integer.parseInt(br.readLine());
		System.out.println("레포트고사를 입력 :"); report = Integer.parseInt(br.readLine());
		System.out.println("출석고사를 입력 :"); attend = Integer.parseInt(br.readLine());
		
		System.out.println("중간고사 : "+ mid);
		System.out.println("기말고사 : "+ fin);
		System.out.println("레포트고사 : "+ report);
		System.out.println("출석고사 : "+ attend);
		
		score = (double)(mid+fin)/2*0.6 + report*0.2 + attend *0.2 ;
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else 
			grade = 'F';
		
		switch (grade) {
		case 'A' : 
		case 'B' : app = "excellent"; break;
		case 'C' :
		case 'D' : app ="good"; break;
		case 'F' : app ="poor"; break;
		}
		
		System.out.printf("성적 : %.2f\n", score);
		System.out.println("학점 ="+grade);
		System.out.println("평가 ="+app);
		
		
		}

	}
