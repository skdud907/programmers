class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result_price = 0;
        
        for(int i = 1; i <= count; i++) {
            result_price += (i * price);
        }
        
        if(money < result_price) {
            answer = result_price - money;
        } else {
            answer = 0;
        }
        return answer;
    }
}