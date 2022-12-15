import java.util.stream.Stream;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = "";
        String num = String.valueOf(n);
        
        int[] after = Stream.of(num.split("")).mapToInt(Integer::parseInt).toArray();
        
        Integer[] result = Arrays.stream(after).boxed().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        
        for(int i = 0; i < result.length; i++) {
            str += result[i];
        }
        
        return Long.parseLong(str);
    }
}