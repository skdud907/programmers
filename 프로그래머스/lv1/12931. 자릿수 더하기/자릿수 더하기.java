import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String before = String.valueOf(n);
        
        int[] after = Stream.of(before.split("")).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 0; i < after.length; i++) {
            answer += after[i];
        }
        return answer;
    }
}