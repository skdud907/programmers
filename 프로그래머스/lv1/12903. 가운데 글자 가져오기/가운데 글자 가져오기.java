class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length() / 2; 
        
        if(s.length() % 2 == 0) {
            answer = s.substring(center-1, center+1);
        } else {
            answer = String.valueOf(s.charAt(center));
        }
        
        return answer;
    }
}