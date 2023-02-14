package ch02.lecture.p02type;

public class C08Double {

	public static void main(String[] args) {
		//실수
		//float(4 bytes), double(8 bytes)
		
		int i1 = 3;
		//i1 = 3.14;   xxx
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 99;
		
		float f1 = 3.14F; // F, f 끝문자로 float literal 표현 (기본적으로 double 타입으로 해석함)
		f1 = 3;
		
		// 사용시 주의
		// 10진법 -> 2진법으로 바꿔서 저장
		// 
		
		double d2 = 0.1; //
		double d3 = 0.2;
		
		double d4 = d2 + d3; // 근사한 값으로 저장되기 때문에 문제가 생길 수 있음
		
		System.out.println(d4);
		
		

	}

}
