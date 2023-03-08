package javabasic.ch07;

class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	//인스턴스멤버 간에는 서로 직접 접근이 가능함
	InstanceInner iv = new InstanceInner();
	//static멤버 간에는 서로 직접 접근이 가능함
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static멤버는 인스턴스멤버에 직접 접근 불가
		//InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//굳이 접근하려면 아래와 같이 객체를 생성해야 함
		//인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성 가능
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	void instanceMethod() {
		//인스턴스메소드에서는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없음
//		LocalInner Iv = new LocalInner();
	}
	void myMethod() {
		class LocalInner {}
		LocalInner Iv = new LocalInner();
	}
}
