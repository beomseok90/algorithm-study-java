import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        
        Arrays.sort(strArr, Collections.reverseOrder());
        
        for (int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]) * Math.pow(10, strArr.length - i - 1);
        }
        
        return answer;
    }
}