package ch04.check;

public class CheckQuestion05 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			
			for(int y=1; y<=10; y++) {
				if((4*x+5*y) ==60) {
					// 4x + 5y 만 적으면 안됨
					System.out.println("("+ x + "," + y + ")");
					continue;
				}
			}
		}
	}

}
