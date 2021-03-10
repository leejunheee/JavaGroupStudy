package CH4;

public class Exercise4_2 {

	public static void main(String[] args) {
		int sum = 0;

		for(int i=1; i <=20; i++) {
			if (i%3==0)  // 해설지 : if (i%3!=0 && i%2==0) 
				continue;
			if (i%2==0)
				continue; 

			sum = sum + i;
			
			

		} 
		System.out.println(sum);

	}
}
// 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 합
