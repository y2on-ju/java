package programmers;

public class Lv2_12939 {


class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        int[] num = new int[strings.length];
        
        for(int i = 0; i<strings.length; i++) {
            num[i] = Integer.parseInt(strings[i]);
        }
        
        int min = num[0];
        int max = num[0];
        
        for(int i=0; i<num.length; i++){
            if(min>num[i]){
                min = num[i];
            }
            if(max<num[i]){
                max=num[i];
            }
        }
        
        
        answer = min + " " + max;
        
        return answer;
    }
}
}
