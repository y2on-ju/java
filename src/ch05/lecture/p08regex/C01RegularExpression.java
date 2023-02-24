package ch05.lecture.p08regex;

import java.util.Arrays;

public class C01RegularExpression {
	public static void main(String[] args) {
		// regular expression
		// 정규식, 정규표현식, 정규식표현
		// 패턴을 표현하는 문자열
		
		
		String str = "java,		   css,   html    ,    spring";
		
		String[] arr1 = str.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = str.split("\\s*,\\s*");
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = str.split("\s*,\s*");
		System.out.println(Arrays.toString(arr3));
		
//		System.out.println("a\sb");
//		System.out.println("a b");
//		System.out.println("a\\sb");
	}
}





