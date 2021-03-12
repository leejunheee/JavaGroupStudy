package CH3;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'B';
		
		char lowerCase = ('A' <= ch && ch <= 'z' ) ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("lowerCase:"+lowerCase);
	}

}
//대문자를 소문자로 변경, ch에 저장된 문자가 대문자인 경우에만 소문자로 변경, 문자코드는 소문자가 대문자보다 32만큼 큼