package CH5;

public class ArrayEx8 {

	public static void main(String[] args) {
		String src = "ABCDE" ;
		
		for(int i=0; i< src.length(); i++)
			System.out.println("src.charAt("+i+"):" + src.charAt(i));
	}

}
// String 클래스의 charAt(int idx)은 문자열 중에서 idx번째 위치에 있는 문자를 반환.