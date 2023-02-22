package ch05.check;

public class checkQuestion07 {
	public static void main(String[] args) {
		//주어진 배열 항목에서 최대값 출력하기
		int[] array = {1,5,3,8,2};
		int max = 0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>max) {
				max = array[i];
			} 
		}
		System.out.println(max);
	}

}
