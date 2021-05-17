package ProgrammersCodingTest;
//문자열 다루기 기본 
public class Test1 {
	public static void main(String[] args) {
		Solution so = new Solution();

		System.out.println(so.solution("a1234"));
	}
}
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int length = s.length();
        if(length != 4 && length != 6) {
			return false;
		}
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(c < '0' || c >'9') {
        		answer= false;
        	}
        }
       
        return answer;
    }
}