package CH3;

public class Exercise3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);

		char ch = 'A';
		ch = (char) (ch + 2);

		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000l;
		// 피연산자 중 적어도 한값은 long타입이어야 최종결를 long타입의 값으로 얻을수있음.

		float f2 = 0.1f;
		double d = 0.1;

		boolean result = (float)d == f2;
		//float를 double로 형변환하기보다는 double값을 유효자리수가 적은 float로 형변환해서 비교하는것이 정확한결과

		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);

	}

}
