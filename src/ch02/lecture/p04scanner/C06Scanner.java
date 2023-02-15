package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	// 백준 2525
	public static void main(String[] args) {
//		String input = """
//				14 30
//				20""";
		
//		String input = """
//				17 40
//				80""";
		
		String input = """
				23 48
				25""";
		
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		
		// 코드 작성
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2);
		
		int currentHour = line1Scanner.nextInt();
		int currentMin = line1Scanner.nextInt();
		
		int pastMin = line2Scanner.nextInt();
		
		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " + currentMin);
		
		
	}
}



