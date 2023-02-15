package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째값 입력>");
		String str1 = scanner.nextLine();
		
		System.out.println("두번째값 입력>");
		String str2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
//		System.out.println(str1 + str);
		System.out.println(num1 + num2);
	}
}




