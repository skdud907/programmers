class Solution {
    public int solution(int[] numbers) {
        int answer = 45; //0~9를 더한 값
        for (int n : numbers) { 
            answer -= n;
        }
        
        return answer;
    }
}