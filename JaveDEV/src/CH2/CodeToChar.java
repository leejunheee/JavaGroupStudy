package CH2;

public class CodeToChar {

	public static void main(String[] args) {
		int code = 65; // 또는 int code = 0x0041;
		char ch = (char) code; //형 변환

		System.out.println(code);
		System.out.println(ch);
		System.out.println(ch+7);
	}

}
