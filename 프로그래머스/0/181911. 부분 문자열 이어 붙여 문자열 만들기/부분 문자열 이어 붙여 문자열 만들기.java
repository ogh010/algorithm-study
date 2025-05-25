class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i<my_strings.length; i++){
            int num1 = parts[i][0];
            int num2 = parts[i][1];
            
            answer += my_strings[i].substring(num1,num2+1);
        }
        
        return answer;
    }
}