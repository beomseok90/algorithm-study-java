class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        
        if (!s.contains("p") && !s.contains("y")) {
            return true;
        }
        
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                p++;
            } else if (c == 'y') {
                y++;
            }
        }
        
        return p == y ? true : false;
    }
}