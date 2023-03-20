package javabasic.ch13;

class Ex13_8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start(); th2.start();
		
		try {
			th1.sleep(2000);   //Thread.sleep(2000);로 작성하는게 바람직함, 현재 실행중인 쓰레드에 대해 작동함
		} catch(InterruptedException e) {}
		
		System.out.println("<<main 종료>>");
	}//main
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.println("<<th1 종료>>");
	} //run()
}
class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	} //run()
}