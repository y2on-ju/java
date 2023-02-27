package ch06.lecture.p02field;

public class C02Field {
	public static void main(String[] args) {
		MyClass02 var1 = new MyClass02();
		System.out.println(var1.age); // 0
		System.out.println(var1.married); // false
		System.out.println(var1.name); // null
		
		// 초기화 되지 않은 변수 사용 불가
		/*
		int a;
		System.out.println(a);
		*/
	}
}