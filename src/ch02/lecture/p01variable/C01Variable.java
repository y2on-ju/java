package ch02.lecture.p01variable;

public class C01Variable {
	
	public static void main(String[] args) {
		//변수
		// 값을 담을 수 있는 이름있는 공간
		
		//변수 선언
		//타입 변수명
		int age;
		double average;
		
//		변수명
//		영문대소문자, _, $, 숫자 조합으로 작성가능, 숫자로 시작하면 안됨
//				변수명 작성 관습 : lowerCamelCase
		int $;
//		int _; // _ 단독으로 변수명 불가
		int hello;
		int your_age; // 관습에 따라 int yourAge; 가 더 바람직함
		int h3;
//		int 3h; //숫자로 시작 불가
		int 나이; // 영문을 권장함

		// 변수를 여러개 선언가능
		int myAge, hisAge, herAge;
		//같은 이름의 변수 선언 불가
		int hi;
//		int hi; // X
		
		//변수 값 대입(할당): =
		hi = 3;
		int var1;
		var1 = 99;
		
		//변수 선언과 값 대입(할당) 동시에 가능
		int var2 = 100;
		
		//여러개 가능
		int var3 = 20, var4 = 30;
		//값을 할당하지 않은 변수 사용 불가 즉, 초기화하지 않은 변수 사용 불가
		int var5;
//		System.out.println(var5); // 오류
		
		//변수명 작성시 어떤 값을 갖는지 알아볼 수 있게
		int koreanScore;
		int ks; // 놉! 
		
		
	
	}

}
