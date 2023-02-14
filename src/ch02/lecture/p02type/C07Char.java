package ch02.lecture.p02type;

public class C07Char {

	public static void main(String[] args) {
		// char (문자)
		// 하나의 문자값 저장
		// 2 bytes (16 bits)
		// 0 ~ 65535 (unicode)
		
		char c1 = 65261;
		
		System.out.println(c1);
		
		char c2 = 8594;
		
		System.out.println(c2);
		
		char c3 = '\u53f8';
		System.out.println(c3);
		
		char c4 = 'a' ;
		System.out.println(c4);
		
		char c5 = '가';
		System.out.println(c5);
		
		//char c6 = 'ab'; // 하나의 문자만 가능함
		//char c7 = ''; // xx 빈 문자 에러
		
		char c8 = ' ';  //공백 하나 포함하면 에러 아님
		
		char c9 = 'b';
		System.out.println(c9-c4);

	}

}
