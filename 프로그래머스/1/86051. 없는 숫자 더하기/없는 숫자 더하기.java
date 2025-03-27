import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(1, 9).filter(i -> Arrays.stream(numbers).noneMatch(num -> num == i)).sum();
    }
}