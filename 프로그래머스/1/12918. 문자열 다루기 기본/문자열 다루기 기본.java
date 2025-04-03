class Solution {
    public boolean solution(String s) {
        int length = s.length();
        if (length != 4 && length != 6) {
            return false;
        }
        
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        
        return true;
    }
}