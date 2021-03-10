package CH4;

public class Exercise4_3 {

	public static void main(String[] args) {
		int sum = 0;
		int x = 0;
		
		for(int i =1; i <=10; i++) {
			sum = sum + i;
			x = x + sum ;
		}
		System.out.println(x);

	}

}
//1+(1+2}+(1+2+3}+(1+2+3+4)+ ... +( 1+2+3+ ... +10) 의 결과를 계산