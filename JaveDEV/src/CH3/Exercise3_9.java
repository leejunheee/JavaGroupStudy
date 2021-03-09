package CH3;

public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a'<= ch && ch <= 'z')||('A'<= ch && ch <= 'Z');
		
		
		System.out.println(b);
	}

}
//문자형 변수 ch가 영문자이거나 숫자일때만 변수 b의 값이 true가 되도록하는 코드
//어렵다 .......