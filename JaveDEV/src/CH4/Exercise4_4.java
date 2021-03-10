package CH4;

public class Exercise4_4 {

	public static void main(String[] args) {
		int sum = 0; //총합을 저장할 변수
		int s = 1; //값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		//조건식의 값이 true이므로 무한반복문이 된다.
		for(int i=1; true; i++, s=-s) {//매 반복문마다 s의 값은 1, -1 ,1 ...
			num = s * i; // i와 부호 s를 곱해 더할값을 구한다.
			sum = sum + num;
			
			if (sum >= 100)
				break;
		}
		
		System.out.println(num);

	}

}
// 1+(-2)+3+( -4)+ .. 과 같은 식으로 계속 더해나갔을 때 , 몇까지 더해야 총합이 100 이상이 되는지