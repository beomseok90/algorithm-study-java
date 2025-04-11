class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        int end = t.length() - length;
        long numberP = Long.parseLong(p);
        
        for (int i = 0; i <= end; i++) {
            long number = Long.parseLong(t.substring(i, i + length));
            
            if (number <= numberP) {
                answer++;
            }
        }
        
        return answer;
    }
}