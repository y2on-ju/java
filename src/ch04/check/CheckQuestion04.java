package ch04.check;

public class CheckQuestion04 {
	public static void main(String[] args) {
		
		
	
		
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			if((num1+num2)==5) {
				System.out.println("(" +num1+ "," +num2+")");	
				break;
			}else {
				System.out.println("(" +num1+ "," +num2+")");
			}
			
		}
		 System.out.println("두눈의 합이 5이면 멈춤");
	}

}
