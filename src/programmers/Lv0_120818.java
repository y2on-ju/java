package programmers;

public class Lv0_120818 {
	class Solution {
	    public int solution(int price) {
	       int answer = 0;
	        if(price<300000&&price>=100000){
	            answer = (int)(price * 0.95f);
	        }else if(price<500000&&price>=300000){
	            answer =(int)(price * 0.9f);
	        } else if(price>=500000){
	            answer = (int)(price * 0.8f);
	        }
	        return answer;
	    }
	}
}
