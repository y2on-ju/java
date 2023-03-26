package programmers;

public class Lv0_120826 {
	class Solution {
	    public String solution(String my_string, String letter) {
	        String answer = "";
	       answer = my_string.replaceAll(letter,"");
	        return answer;
	    }
	}
}
