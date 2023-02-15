package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C07Scanner {
	
		// 백준 2525
		public static void main(String[] args) {
//			String input = """
//					14 30
//					20""";
			
//			String input = """
//					17 40
//					80""";
			
			String input = """
					23 48
					25""";
			
			Scanner scanner = new Scanner(input);
			
			int currentHour = scanner.nextInt();
			int currentMin = scanner.nextInt();
			int pastMin = scanner.nextInt();
			
			currentHour = (currentHour + (currentHour + pastMin) / 60) % 24;
			currentMin = (currentMin + pastMin) % 60;
			
			System.out.println(currentHour + " " + currentMin);
	}

}
