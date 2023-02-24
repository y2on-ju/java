package ch05.lecture.p08regex;

public class C17Regex {
	public static void main(String[] args) {
		// 영문대소문자, $, _, 숫자
		// 단, 숫자가 앞에 오면 안됨
		
		String pattern = "[a-zA-Z$_]+[a-zA-Z0-9$_]*";
		
		System.out.println("modelName".matches(pattern)); //true
		System.out.println("class".matches(pattern)); //true
		System.out.println("$value".matches(pattern)); //true
		System.out.println("_age".matches(pattern)); //true
		System.out.println("int".matches(pattern)); //true
		System.out.println("6hour".matches(pattern)); //false
		System.out.println("#name".matches(pattern)); //false
	}
}