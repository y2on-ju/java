package ch05.check;

import java.util.Scanner;

public class checkQuestion09 {
	public static void main(String[] args) {
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		int students = 0;
		int[] scores = null;
		int menuNum = 0;
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 |5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1 :
				System.out.print("학생수> ");
				students += sc.nextInt();
				break;
			case 2 :
				scores = new int[students];
				for(int i=0; i<students; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3 :
				for(int k=0; k<scores.length; k++) {
					System.out.println("scores["+ k + "]:" + scores[k]);
				}
				break;
			case 4 :
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>max) {
						max = scores[i];
					}
					// 삼항연산자를 이용하여 한줄로 가능 max = (max<scores[i])? scores[i] : max;
				}
				System.out.println("최고 점수:" + max);
				
				for(int i =0; i<scores.length; i++) {
					sum += scores[i];
				}
				double avg = (double) sum / scores.length;
				System.out.println("평균 점수:" + avg);
				break;
			case 5 :
				run = false;
				break;
		}
	}
		System.out.println("프로그램 종료");

}
}
