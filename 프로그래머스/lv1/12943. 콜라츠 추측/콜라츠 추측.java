class Solution {
    public int solution(int num) {
        long number = num;
        int count = 0;
        
        if(number == 1) {
            return 0;
        } 
        
        while(true) {
            if(count > 500) {
                count = -1;
                break;
            } else if(number != 1) {
                if(number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = (number * 3) + 1;
                }
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}