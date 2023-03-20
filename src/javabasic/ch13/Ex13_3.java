package javabasic.ch13;

///싱글쓰레드 와 멀티쓰레드 비교 
// 멀티쓰레드가 더 느릴때도 있음
class Ex13_3 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i =0; i< 300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간1:" + (System.currentTimeMillis()-Ex13_3.startTime));
	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("소요시간2:" + (System.currentTimeMillis()-Ex13_3.startTime));
	}
}