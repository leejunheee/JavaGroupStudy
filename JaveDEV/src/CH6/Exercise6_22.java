package CH6;

public class Exercise6_22 {
	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
// 넘겨받은 문자열(str)이 null이거나 빈 문자열이면 false를 반환
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch<'0' || ch>'9') {
				return false; //읽어온 문자(ch)가 숫자가 아니면 false반환
			}
		}//for
		
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}

}
