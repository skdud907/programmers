class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count = 0, y_count = 0;
        
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++) {
            switch(str[i]) {
                case "p":
                    p_count += 1;
                    break;
                case "P":
                    p_count += 1;
                    break;
                case "y":
                    y_count += 1;
                    break;
                case "Y":
                    y_count += 1;
                    break;
                       
            }
        }
        if(p_count == y_count) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}