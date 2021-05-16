package CodingTest;
//나누어 떨어지는 숫자 배열

import java.util.ArrayList;
import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] arr = {5,9,7,10};
		s.solution(arr,5);
		
	}
}

class Solution5 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
       ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i ++) {
        	if (arr[i] % divisor ==0) {
        		array.add(arr[i]);
        	}  
        	
        }
        
        if(array.isEmpty()) {
        	array.add(-1);
        }
        
        answer = new int[array.size()];
        for(int j = 0 ; j < answer.length; j++) {
        	answer[j]= array.get(j);
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}






