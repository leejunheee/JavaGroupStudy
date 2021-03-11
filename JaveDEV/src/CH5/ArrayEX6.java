package CH5;

import java.util.Arrays;

public class ArrayEX6 {

	public static void main(String[] args) {
		int[] number = new int[10];
		System.out.println("number : " + Arrays.toString(number));
		int[] counter = new int[10];
		System.out.println("counter : " + Arrays.toString(counter));

		for (int i=0; i<number.length; i++) {
			number[i]= (int)(Math.random()*10);

		}
		System.out.println("number : " + Arrays.toString(number));
		System.out.println();

		for(int i =0; i<number.length; i++) {
			counter[number[i]]++;
			System.out.println("counter : " + Arrays.toString(counter));
		}

		for(int i=0; i <number.length; i++) {
			System.out.println(i + "ÀÇ °³¼ö :" + counter[i]);
		}

	}

}
