package ch04.check;

public class CheckQuestion03 {
	public static void main(String[] args) {
		int sum =0;
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("100까지의 정수 중 3의 배수의 총합 : " + sum);
	}

}
