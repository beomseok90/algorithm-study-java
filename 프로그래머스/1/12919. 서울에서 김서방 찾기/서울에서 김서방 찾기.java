class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        StringBuilder answer = new StringBuilder("김서방은 ");
        
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer.append(i).append("에 있다");
                break;
            };
        }
        
        return answer.toString();
    }
}