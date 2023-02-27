package ch05.lecture.p08regex;

public class C23Regex {
	public static void main(String[] args) {
		// .  (모든 문자)
		// \. (.)
		
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
		
		
		// 영문대소문자여러개 .com 으로 끝나는지?
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3));
		System.out.println("daum.net".matches(pattern3));
		System.out.println("daumcom".matches(pattern3));
	}
}


