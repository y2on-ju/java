package ch04.check;

import java.util.Scanner;

public class CheckQuestion07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		int balance = 0;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			
			String strNum = scanner.next();
			
			
			if(strNum.equals("1")) {
				System.out.println("예금액>");
				balance = scanner.nextInt();
				money += balance;
			} else if(strNum.equals("2")) {
				System.out.println("출금액>");
				balance = scanner.nextInt();
				money -= balance;
			} else if (strNum.equals("3")) {
				System.out.println("잔고>"+money);
				
			} else if(strNum.equals("4")) {
				System.out.println("프로그램 종료");
				run = false;
			}
			
		}
	}

}


