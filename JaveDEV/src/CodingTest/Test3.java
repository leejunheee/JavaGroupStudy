package CodingTest;

public class Test3 {
	int sum = 0;
	public double solution(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		
        double answer = 0;
        
        answer = sum /(double) arr.length;
        return answer;
    }
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		int[] x = {5,4,3};
		System.out.println(t.solution(x));
	
	
	}
}


