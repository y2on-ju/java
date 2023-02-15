package ch02.lecture.p02type;

public class C15String {
	public static void main(String[] args) {
		//String과 기본 타입과의 연산
		// +외에 안됨
		
		String s1 = "3";
		String s2 = "4";
//		System.out.println(s1 * s2); //안됨
		
		// + : 연결연산(concatenate)
		int i3 = 3;
		String s3 = "4";
//		int r3 = i3 + s3; //연산결과가 String
		String r3 = i3 + s3; //연산결과가 String
		
		System.out.println(r3);
		System.out.println(3.14 + "hello");
		System.out.println(false + "hi");
		
		String r4 = 3 + 3 + "4";
		System.out.println(r4);
		
		String r5 = "3" + 3 + 4;
		System.out.println(r5);
		
		// 기본타입 -> 스트링
		// valueOf
		// 빈문자열과 연결연산
		int i6 = 99;
		String s6 = String.valueOf(i6);
		String s7 = 99 + "";
		
		System.out.println(s6);
		System.out.println(s7);
		
		boolean b8 = false;
		String s8 = String.valueOf(b8);
		String s9 = b8 + "";
		System.out.println(s8); //문자열
		System.out.println(s9); //문자열
		
	}

}
