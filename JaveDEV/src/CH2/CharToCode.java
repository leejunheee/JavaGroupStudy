package CH2;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = '\u10041'로 바꿔써도 같다.
		int code = (int)ch;

		System.out.println(ch);
		System.out.println(code);
	}

}
