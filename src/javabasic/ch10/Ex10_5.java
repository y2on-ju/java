package javabasic.ch10;

import java.util.*;

class Ex10_5 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage : java Ex10_5 2019 9");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); //시작일
		Calendar eDay = Calendar.getInstance(); //끝일
		
		//월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
		//예를 들어, 2019년 11월 1일은 sDay.set
	}

}
