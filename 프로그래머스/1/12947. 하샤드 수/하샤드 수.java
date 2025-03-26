class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String strX = String.valueOf(x);
        
        for (char c : strX.toCharArray()) {
            sum += (int) c - 48;
        }
        
        return x % sum == 0;
    }
}