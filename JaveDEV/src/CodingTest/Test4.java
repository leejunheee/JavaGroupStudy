package CodingTest;
//콜라츠 추측 
public class Test4 {
	static int cnt = 0;

	public int solution(int num) {
		for (int i = 1; i < 500; i++) {
			if (num % 2 == 0) {
				num = num / 2;
				cnt++;
			} else if (num % 2 == 1 && num != 1) {
				num = num * 3 + 1;
				cnt++;
			} else if (num == 1) {
				break;
			} else {
				cnt = -1;
			
			}
		}
		return cnt;

	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.solution(626331);
		System.out.println(cnt);
	}
}
