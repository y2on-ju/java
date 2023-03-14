package javabasic.ch09;
import java.util.*;
class Ex10_1 {
	public static void main(String[] args) {
		//기본적으로 현재날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("");
		
	}

}
