package ch05.lecture.p08regex;

public class C26Regex {
	public static void main(String[] args) {
		// group
		// ()
		
		String pattern1 = "(\\w\\d){2}";
		System.out.println("a3_4".matches(pattern1));
		
		// 전화번호
		// 010이 있어도 되고 없어도 되고
		// 숫자 8개
		
		String pattern2 = "(010)?\\d{8}";
		System.out.println("01077777777".matches(pattern2));
		System.out.println("55555555".matches(pattern2));
		
	}
}



