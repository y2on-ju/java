package javabasic.ch11;

import java.util.*;
import static java.util.Collections.*;

 class Ex11_19 {
	 public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println();
		System.out.println("addAll");
		System.out.println(list);
		
		rotate(list, 2);               //오른쪽으로 두 칸씩 이동
		System.out.println();
		System.out.println("rotate(list,2);");
		System.out.println(list);
		
		swap(list, 0, 2);              //첫 번째와 세 번째를 교환(swap)
		System.out.println();
		System.out.println("swap(list, 0, 2);");
		System.out.println(list);
		
		shuffle(list);                // 저장된 요소의 위치를 임의로 변경
		System.out.println();
		System.out.println("shuffle(list);");
		System.out.println(list);
		
		sort(list, reverseOrder());   //역순 정렬 reverse(list);와 동일
		System.out.println();
		System.out.println("sort(list, reverseOrder());");
		System.out.println(list);
		
		sort(list);    //정렬
		System.out.println();
		System.out.println("sort(list);");
		System.out.println(list);
		
				
	}

}
