package ProgrammersCodingTest;

import java.util.Arrays;

public class Test2 {

}
class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
       
        int i ;
        for( i =0 ; i< completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
                return participant[i];
        	}
        }
        
        return participant[i];
    }
}