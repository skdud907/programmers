import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        int min = arr[0];
        for(int num : arr) {
            if(num < min) {
                min = num;
            } 
        }

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            } else {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}