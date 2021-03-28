package JavaBasicQuiz;
//65430원을 만들기 위한 화폐의 갯수를 구하시오.
public class Quiz2 {

	public static void main(String[] args) {
		int money = 65430;
		int a,b,c,d;
		
		System.out.println("money = "+money);
		a = money/10000;
		money = money - a*10000;
		b= money/1000;
		money = money - b*1000;
		c=money/100;
		money = money - c*100;
		d = money/10;
		money = money - d*10;
		System.out.println("만원 = "+ a);
		System.out.println("천원 = "+ b);
		System.out.println("백원 = "+ c);
		System.out.println("십원 = "+ d);
	}

}
