package javabasic.ch08;

class Ex8_5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생!
			System.out.println(4);   //실행되지 않음 (예외발생이후 실행 안됨
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메세지 : " + ae.getMessage());
		} //try-catch의 끝
		
		System.out.println(6);
	}//main메소드 끝

}
