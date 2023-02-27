package ch05.lecture.p08regex;

public class C19Regex {
	public static void main(String[] args) {
		// 빈칸
		// \s
		
		String pattern1 = "\\s"; // \s
		
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1));
		System.out.println("\t".matches(pattern1));
		
		
		// 소문자단어 3개로 이루어져있는지?
		String pattern2 = "\s*[a-z]+\s[a-z]+\s[a-z]+\s*";
		System.out.println("hello world java".matches(pattern2));
		System.out.println("hello world".matches(pattern2));
		System.out.println("   hello world java   ".matches(pattern2));
		
	}
}





