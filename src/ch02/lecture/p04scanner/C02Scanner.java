package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키보드로 작성해보세요");
		
		String line = scanner.nextLine();
		
		System.out.println("입력된 값 출력");
		System.out.println(line);
		
		
		
	}

}
