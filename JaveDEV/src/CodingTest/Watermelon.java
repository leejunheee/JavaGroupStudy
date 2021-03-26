package CodingTest;

class Watermelon {
	public String watermelon(int n) {
		String answer = "";
		for(int i =0; i<n; i++) 
			answer = answer + (i%2==0 ? "수":"박");
			return answer;
		
		/*for(int i=1;i<=n;i++) {
			if(i%2==1) {
				answer=answer+"수";
			} else {
				answer = answer+"박";
			}
			
		}
		return answer; */
	}

	public static void main(String[] args) {
		Watermelon w = new Watermelon();
		System.out.println("n이 3인 경우 :"+w.watermelon(3));
		System.out.println("n이 3인 경우 :"+w.watermelon(4));
	}
}