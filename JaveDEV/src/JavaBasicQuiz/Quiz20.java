package JavaBasicQuiz;

/*
 output(10,'#')함수를 호출하여 다음과 같이 출력하시오

        조건)출력문에서 for문을 이용하시오
 */
public class Quiz20 {
	public static void output(int num, char c) {
		for (int i = 1; i <= num; i++) {
			System.out.print(c + " ");
		}
	}

	public static void main(String[] args) {
		output(10, '#');
	}

}
