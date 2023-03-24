package programmers;
import java.util.Arrays;

public class Lv0_120847 {
	
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a,b = 0;
        Arrays.sort(numbers);
        
        a = numbers[numbers.length-1];
        b = numbers[numbers.length-2];
        answer = a * b;
        return answer;
    }
}
}