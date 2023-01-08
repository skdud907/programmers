import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        String[] strToStrArray = s.split("");
        
        Arrays.sort(strToStrArray, Collections.reverseOrder());
        
        for(String aanswer : strToStrArray){
		    stringBuilder.append(aanswer);
	    }
        
        answer = stringBuilder.toString();
        
        return answer;
    }
}