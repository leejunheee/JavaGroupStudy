package JavaBasicQuiz;

public class Quiz5 {

	public static void main(String[] args) {
		String name = "민들래";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int sum = kor + eng + mat;
		double avg = (double)sum/3;
		
		System.out.println("이름 : "+name);
		System.out.println("합계점수 :"+sum);
		System.out.printf("평균점수 : %.1f",avg);
	}

}
