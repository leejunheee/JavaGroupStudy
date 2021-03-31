package JavaBasicQuiz;
import java.util.Random;
public class Quiz14 {

	public static void main(String[] args) {
		int num;
		int sum =0;
		
		for(int i=1; i<50; i++) {
			num = new Random().nextInt(101); 
			System.out.print(num+"\t");
			sum = sum +num;
			if(i % 6 ==0)
				System.out.println();
		}
		System.out.println("\n합 = " +sum);
	}
}
