package ch05.lecture.p08regex;

public class C18Regex {
	public static void main(String[] args) {
		// 특수기호
		// Predefined character classes
		// 숫자
		String pattern1 = "[0-9]";
		String pattern2 = "\\d"; // \d
		
		System.out.println("0".matches(pattern1));
		System.out.println("0".matches(pattern2));
		System.out.println("5".matches(pattern2));
		System.out.println("9".matches(pattern2));
		
		System.out.println("19990112".matches("[0-9]{8}"));
		System.out.println("19991212".matches("\\d{8}"));
		
		// 전화번호
		// 010 으로 시작, - 하나 있거나 없거나, 숫자 4개, - 하나 있거나 없거나, 숫자 4개
		String number1 = "01099999999";
		String number2 = "010-88888888";
		String number3 = "010-7777-7777";
		
		String pattern3 = "010-?\\d{4}-?\\d{4}";    // ?는 그앞에 적힌(-) 조건이 1개있거나 없거나
		
		System.out.println(number1.matches(pattern3));
		System.out.println(number2.matches(pattern3));
		System.out.println(number3.matches(pattern3));
	}
}





