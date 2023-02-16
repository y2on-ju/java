package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	// 백준 11021
	public static void main(String[] args) {
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";
		
		Scanner scanner = new Scanner(input);
		int loop = scanner.nextInt();
		
		for (int i = 1; i <= loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			
			// 둘 중에 편한것 쓰면됨
			
			System.out.printf("Case #%2$d: %1$d%n", (a + b), i);
			System.out.println("Case #" + i + ":" + (a + b));
		}
	}
}




