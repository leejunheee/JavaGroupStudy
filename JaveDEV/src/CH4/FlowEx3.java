package CH4;

public class FlowEx3 {

	public static void main(String[] args) {
		int score = 95;
		char grade = ' '; //학점을 저장하기 위한 변수, 공백으로 초기화
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		
		System.out.println("너의 학점 "+ grade + "이다.");

	}

}
