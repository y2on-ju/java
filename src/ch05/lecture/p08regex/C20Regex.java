package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20Regex {
	public static void main(String[] args) {
		String str1 = "  al ad al   aldkfj a   asdflk asdf  as;df a  ";
		String str2 = str1.replaceAll("\\s+", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "alierj   ,    lakjdf,akdfj  ,   aldjkfa";
		String[] str4 = str3.split("\s*,\s*");
		
		System.out.println(Arrays.toString(str4));
	}
}




