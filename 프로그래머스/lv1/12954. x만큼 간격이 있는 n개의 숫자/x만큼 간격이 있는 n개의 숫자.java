class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        // int result = x;
        answer[0] = x;
        for(int i = 1; i < n; i++) {
            x += answer[0];
            answer[i] = x;
        }
        return answer;
    }
}