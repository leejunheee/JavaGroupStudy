package CH3;

public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		char c4 = 's';

		int i = c1 + 1;

		c3=(char)(c1 +1);
		c2 =(char) (c2 + 2) ;
		
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		System.out.println((int)c4);

	}

}
