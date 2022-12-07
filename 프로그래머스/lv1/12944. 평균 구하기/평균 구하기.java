class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int array : arr) {
            answer = answer + array;
        }
        return answer / arr.length;
    }
}