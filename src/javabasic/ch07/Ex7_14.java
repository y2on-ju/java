package javabasic.ch07;

 class Ex7_14 {
}

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class instanceInner {
		int iiv = outerIv;   //외부 클래스의 private멤버도 접근 가능
		int ivv2 = outerCv;
	}
	static class StaticInner {
		//스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	void myMethod() {
		int Iv = 0;
		final int LV = 0;    //JDK1.8부터 final 생략 가능
		
		class LocalInner {
			int liv = outerIv;
		}
	}
}
