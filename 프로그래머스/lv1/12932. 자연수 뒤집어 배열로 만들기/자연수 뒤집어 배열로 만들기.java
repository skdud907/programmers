import java.util.*;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        String before = String.valueOf(n);
        int[] after = Stream.of(before.split("")).mapToInt(Integer::parseInt).toArray();
        
        int[] answer = new int[after.length];
        for (int i = 0; i < after.length; i++) {
            answer[after.length - i - 1] = after[i];
        }
        
        return answer;
    }
}