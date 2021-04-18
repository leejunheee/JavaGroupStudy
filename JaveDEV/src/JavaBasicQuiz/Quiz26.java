package JavaBasicQuiz;

import java.util.Arrays;

//크기가 5인 정수형배열을 잡아 난수1~50을 저장하여 출력 
public class Quiz26 {
	public static void main(String[] args) {
		
		int[] list = new int[5];
		int sum = 0;
		
		System.out.println("[정렬전]");

		for(int i =0; i < list.length; i++) {
			list[i] = (int)(Math.random()*50)+1;
			
			System.out.printf("num[%d]= %d ",i,list[i]);
		}
		System.out.println();
		
		Arrays.sort(list);
		System.out.println("[정렬후]");
		for(int i =0; i<list.length; i++) {
			System.out.printf("num[%d]= %d ",i,list[i]);
			sum += list[i];
		}
		System.out.println();
		System.out.println("합 = " +sum);
	}
}
