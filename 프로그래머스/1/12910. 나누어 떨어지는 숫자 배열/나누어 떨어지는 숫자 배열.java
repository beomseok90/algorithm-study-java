import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).sorted().filter(i -> i % divisor == 0).toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}