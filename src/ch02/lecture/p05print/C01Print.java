package ch02.lecture.p05print;

public class C01Print {
	public static void main(String[] args) {
		//println
		//파라미터 출력 후 엔터 출력
		System.out.println("hello");
		System.out.println("world");
		System.out.println(true);
		
		//파라미터 없으면 엔터만 출력됨
		System.out.println();
		System.out.println();
		
		
		
		
		//print
		// 파라미터 출력
		System.out.print("hello");
		System.out.print("world");
		
		
		//printf
		//형식에 맞춰서 출력
		System.out.printf("어떤 형식");
		System.out.printf("또 다른 형식");
		
		// %n : 새로운 줄 
		System.out.printf("새로운 줄 포함 %n 새 줄에 출력됨");
		
		// \n : 새로운 줄
		System.out.println("역슬래시 사용 \n새 줄?");
		
		// %d : 10진법 정수
		System.out.printf("10진법 정수 %d", 99);
		System.out.printf("%n또다른 정수 %d", 300);
//		System.out.printf("%n또다른 정수 %d", "삼백");
		
	}

}
