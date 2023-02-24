package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C07copyMatrix {


	public static void main(String[] args) {
		int[][] arr1 = {
				{5, 7, 9, 10},
				{3, 2, 1, 0}
		};
		
		//깊은 복사 (deep copy)
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length);
		}
		
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.toString(arr2[1]));
		
		arr1[0][0] = 50;
		
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]); // 5 그대로임 50으로 안바뀜
	}
}










