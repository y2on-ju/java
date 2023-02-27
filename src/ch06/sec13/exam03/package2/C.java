package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;        //O
//		a.field2 = 1;        //X    default 필드 접근 불가(컴파일 에러)
//		a.field3 = 1;        //X    private 필드 접근 불가(컴파일 에러)
		
		//메소드 호출
		a.method1();         //O    
//		a.method2();         //X    default 메소드 접근 불가(컴파일 에러)
//		a.method3();         //X    private 메소드 접근 불가(컴파일 에러)
	
	}

}
