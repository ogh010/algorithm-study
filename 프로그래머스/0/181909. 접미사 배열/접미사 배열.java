import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        int size = my_string.length();
        String[] answer = new String[size];
        
        for(int i=0; i<my_string.length(); i++){
            
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}