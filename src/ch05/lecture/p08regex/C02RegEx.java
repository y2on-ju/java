package ch05.lecture.p08regex;

public class C02RegEx {
	public static void main(String[] args) {
		// matches
		// 패턴에 맞으면 true, 그렇지 않으면 false
		
		// 문자 하나 패턴
		System.out.println("a".matches("a"));
		System.out.println("b".matches("b"));
		System.out.println("c".matches("c"));
		
		
		// character class(문자분류)
		
				System.out.println("a".matches("[abc]"));
				System.out.println("b".matches("[abc]"));
				System.out.println("c".matches("[abc]"));
				System.out.println("d".matches("[abc]"));
				
				
				System.out.println("ab".matches("ab"));
				System.out.println("bc".matches("bc"));
				
				System.out.println("ab".matches("[abc][abc]"));
				System.out.println("aa".matches("[abc][abc]"));
				System.out.println("ac".matches("[abc][abc]"));
				System.out.println("bc".matches("[abc][abc]"));
				System.out.println("cc".matches("[abc][abc]"));
				
				
				// character class
				
				System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]"));
				System.out.println("b".matches("[abcdefghijklmnopqrstuvwxyz]"));
				System.out.println("x".matches("[abcdefghijklmnopqrstuvwxyz]"));
				System.out.println("z".matches("[abcdefghijklmnopqrstuvwxyz]"));
				
				System.out.println("a".matches("[a-z]"));
				System.out.println("b".matches("[a-z]"));
				System.out.println("x".matches("[a-z]"));
				System.out.println("z".matches("[a-z]"));
				
				
				System.out.println("Az".matches("[A-Z][a-z]"));
				System.out.println("Bx".matches("[A-Z][a-z]"));
				System.out.println("Za".matches("[A-Z][a-z]"));
				
				System.out.println("za".matches("[A-Z][a-z]"));
				System.out.println("zZ".matches("[A-Z][a-z]"));
				
				
				System.out.println("a".matches("[a-zA-Z]"));
				System.out.println("b".matches("[a-zA-Z]"));
				System.out.println("z".matches("[a-zA-Z]"));
				System.out.println("A".matches("[a-zA-Z]"));
				System.out.println("Z".matches("[a-zA-Z]"));
				
				System.out.println("0".matches("[a-zA-Z]"));
				System.out.println("1".matches("[a-zA-Z]"));
				System.out.println("9".matches("[a-zA-Z]"));
				
				System.out.println("0".matches("[0-9]"));
				System.out.println("1".matches("[0-9]"));
				System.out.println("9".matches("[0-9]"));
				
				System.out.println("a".matches("[0-9a-zA-Z]"));
				System.out.println("Z".matches("[0-9a-zA-Z]"));
				System.out.println("0".matches("[0-9a-zA-Z]"));
				
				// 영문대소문자,숫자로 이루어진 3글자 인가?
				System.out.println("010".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
				System.out.println("abc".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
				System.out.println("aZ3".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
				
				
				// character class
				// negation(not)
				
				// 숫자가 아니면 일치
				System.out.println("0".matches("[^0-9]")); // false
				System.out.println("a".matches("[^0-9]"));
				System.out.println("z".matches("[^0-9]"));
				System.out.println(" ".matches("[^0-9]"));
				System.out.println("$".matches("[^0-9]"));
				
				
				// quantifier (수량자)
				
				// 숫자 3개인가?
				System.out.println("010".matches("[0-9][0-9][0-9]")); // true
				System.out.println("010".matches("[0-9]{3}")); // true
				System.out.println("123".matches("[0-9]{3}")); // true
				System.out.println("12".matches("[0-9]{3}")); // false
				System.out.println("1233".matches("[0-9]{3}")); // false
				System.out.println("ab0".matches("[0-9]{3}")); // false
				
				
				// 010으로 시작하고, - 기호, 숫자 4개, - 기호, 숫자 4개
				
				String pattern = "010-[0-9]{4}-[0-9]{4}";
				
				System.out.println("010-9999-7777".matches(pattern)); // true
				System.out.println("010-9876-7654".matches(pattern)); // true
				System.out.println("010-98767654".matches(pattern)); // false
				System.out.println("010-9876-765".matches(pattern)); // false
				
				
	}
}