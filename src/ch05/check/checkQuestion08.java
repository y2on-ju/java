package ch05.check;

public class checkQuestion08 {
	public static void main(String[] args) {
		// 주어진 배열 항목의 전체 합과 평균 출력하기
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78,83,93,87,88}
		};
		int sum = 0;
		int total = 0;
		for(int i=0; i<array.length; i++) {
			total += array[i].length;
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
			}
		}
		System.out.println("전체합: " + sum);
		
		double avg = (double) sum / total;
		System.out.println("전체 평균: " + avg);
	}

}
