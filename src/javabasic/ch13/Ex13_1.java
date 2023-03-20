package javabasic.ch13;

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);    // 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
	}
}
class ThreadEx1_1 extends Thread{   // Thread클래스를 상속해서 쓰레드 구현
	public void run() {   //쓰레드가 수행할 작업 작성
		for(int i=0; i < 5; i++) {
			System.out.println(getName());    //조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable {  //Runnable 인터페이스를 구현해 쓰레드를 구현
	public void run() {  //쓰레드가 수핼할 작업작성
		for(int i=0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());   
		}
	}
}
