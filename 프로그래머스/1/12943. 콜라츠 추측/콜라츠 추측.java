class Solution {
    public int solution(int num) {
        int answer = 0;
        long target = (long) num;
        
        while (target != 1) {
            target = collatz(target);
            answer++;
        }
        
        return answer > 500 ? -1 : answer;
    }
    
    public static long collatz(long target) {
        if (target % 2 == 0) {
            return target / 2;
        } else {
            return (target * 3) + 1;
        }
    }
}