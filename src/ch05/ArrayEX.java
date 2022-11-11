package ch05;

public class ArrayEX {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		/*
		 int, short, byte 초기값: 0
		 long: 0L
		 char: '\u0000'
		 float: 0.0f
		 double: 0.0
		 boolean: false
		 String: null(클래스는 초기값이 null)
		 */
		
		for (int i=0; i <3; i++) {
			arr1[i] = 10;
		}
		
		for (int i=0; i <3; i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];

		for (int i=0; i <3; i++) {
			System.out.println(arr2[i]);
		}
		
		
		String[] arr3 = new String[3];
		for (int i=0; i <3; i++) {
			System.out.println(arr3[i]);
		}
		
	/*	
		//		String[] season = {"Spring", "Summer", "Fall", "Winter"}; 도 가능
//		String[] season2 = {"Spring", "Summer", "Fall", "Winter"}; 선언만
		String season[] = {"Spring", "Summer", "Fall", "Winter"};

		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		int[] scores = {83, 90, 87};
		
		//총합, 평균
		
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		double avg = (double) sum / 3;
		System.out.println("ChongHab=" + sum + "Average" + avg);
*/
	}

}
