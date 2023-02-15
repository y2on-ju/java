package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	// 백준 25304
	public static void main(String[] args) {
		
//		String input = """
//				260000
//				4
//				20000 5
//				30000 2
//				10000 6
//				5000 8
//				""";
		
		String input = """
				250000
				4
				20000 5
				30000 2
				10000 6
				5000 8
				""";
//		Scanner scanner = new Scanner(input);
		Scanner scanner = new Scanner(System.in);
		
		int total = scanner.nextInt();
		int loop = scanner.nextInt();
		
		for (int i = 0; i < loop; i++) {
			int price = scanner.nextInt();
			int qty = scanner.nextInt();
			
			total -= (price * qty);
		}
		
		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}