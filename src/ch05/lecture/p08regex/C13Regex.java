package ch05.lecture.p08regex;

public class C13Regex {
	public static void main(String[] args) {
		// n개 이상 : {n,}
		
		// 숫자가 2개이상
		String pattern = "[0-9]{2,}";
		
		System.out.println("09".matches(pattern)); // true
		System.out.println("123".matches(pattern)); // true
		System.out.println("2".matches(pattern)); // false
		System.out.println("2a".matches(pattern));// false
	}
}