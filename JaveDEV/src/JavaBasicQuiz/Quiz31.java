package JavaBasicQuiz;

import java.util.Scanner;

public class Quiz31 {

	private int r;
	private double size;
	final double PI = 3.141592;

	public Quiz31() {
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 : ");
		r = sc.nextInt();
		process();

		sc.close();
	}

	public void process() {
		size = r * r * PI;
	}
	
	public void output() {
		System.out.printf("원의 넓이 : %.2f",size);
	}

	public static void main(String[] args) {
		new Quiz31().output();
	}
}
