package javabasic.ch13;

//싱글쓰레드 와 멀티쓰레드 비교 
//싱글쓰레드가 더 빠를때도 있음
class Ex13_2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간1:" +(System.currentTimeMillis()-startTime));
		
		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("소요시간2:" +(System.currentTimeMillis()- startTime));
	}
}
