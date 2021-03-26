package CodingTest;
//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수,
// num은 int 범위 정수
//0은 짝수 

class Solution {
	public String solution(int num) {
		String answer = "Even";
		String answer2 = "Odd";
		String result = (num%2==0)?"Even":"Odd";{
			return result;
		}
	
		/*if (num % 2 == 0) {
			return answer;
		} else {
			return answer2;
		}
		*/
	}
	
	

	public static void main(String[] args) {
		Solution s = new Solution();
		String result = s.solution(4);
		System.out.println(result);

	}

}
