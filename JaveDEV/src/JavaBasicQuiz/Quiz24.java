package JavaBasicQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//0~100사이 임의의 수 하나 발생 
public class Quiz24 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;

		for (;;) {
			int num = (int) (Math.random() * 100) + 1;

			for (int i = 0;; i++) {
				System.out.print("숫자 입력(0~100):");
				int input = Integer.parseInt(reader.readLine());
				cnt++;

				if (input > num) {
					System.out.println("크다.");
				} else if (input < num) {
					System.out.println("작다.");
				} else if (input == num) {
					System.out.printf("맞았다.(%d)\n", cnt);
					break;
				}
			} // for
			System.out.println();
			System.out.print("계속 (y/n): ");
			char check = reader.readLine().charAt(0);
			if (check == 'n')
				;
			break;

		}
	}// main
}
