package ch05.lecture.p08regex;

public class C15Regex {
	public static void main(String[] args) {
		// {0,}
		// * : 0 개 이상
		
		String pattern1 = "[0-9]{0,}";
		String pattern2 = "[0-9]*";
		
		System.out.println("".matches(pattern1));
		System.out.println("".matches(pattern2));
		
		System.out.println("2".matches(pattern1));
		System.out.println("2".matches(pattern2));
		
		System.out.println("25".matches(pattern1));
		System.out.println("25".matches(pattern2));
		
		System.out.println("2a5".matches(pattern1)); // false
		System.out.println("2a5".matches(pattern2)); // false
		
	}
}





