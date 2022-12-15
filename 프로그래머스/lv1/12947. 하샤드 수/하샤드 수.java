import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        int[] arrNum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }
        
        if(x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}