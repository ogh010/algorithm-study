import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        int size = my_string.length(); // 문자열 길이만큼 공간 확보
        String[] answer = new String[size];
        
        for(int i=0; i<my_string.length(); i++){
            // i 부터 끝까지 자른 문자열 answer[i] 에 저장 
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer); // 사전순(오름차순)
        
        return answer;
    }
}