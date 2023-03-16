package javabasic.ch11;

import java.util.*;

 class Ex11_5 {
	 public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//Iterator 일회용임, 다 쓰면 새로운 객체생성해서 다시 얻어와야함 
		//while(false)로 되어서 출력되는값 없음
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		//새로운 iterator객체 만들어서 해야함
		it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			
		}
	} //main
}
