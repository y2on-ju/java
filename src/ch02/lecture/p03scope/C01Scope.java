package ch02.lecture.p03scope;

public class C01Scope {
	public static void main(String[] args) {
		// 변수의 사용범위 (scope)
				// 선언된 블럭안에서만 사용 가능
				
				int v1 = 3;
				
				if (true) {
					System.out.println(v1); // 사용 가능
					
					int v2 = 5;
					
					System.out.println(v2); // 사용 가능
				}
				
//				System.out.println(v2); // 사용 불가
			}
}
	
