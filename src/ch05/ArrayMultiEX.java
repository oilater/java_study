package ch05;

public class ArrayMultiEX {

	public static void main(String[] args) {
//		int[] scores = {10, 90, 10};

		int [][] scores = {
				{80, 90, 96}, {76, 88}};
		int [][] mathScores = new int [2][3];
		
		for (int i=0; i < mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++)
				System.out.println("math score" + mathScores[i][k]);
		}

		int [][] mathScores1 = {
				{80, 81, 82}, 
				{83, 84, 85}
			};	
		mathScores[0][0] = 80;
		mathScores[0][1] = 81;
		mathScores[0][2] = 82;
		mathScores[1][0] = 83;		
		mathScores[1][1] = 84;
		mathScores[1][2] = 85;
		
		System.out.println("1dimension length(num of classroom: " + scores.length);
		System.out.println("2dimension length(num of students of first classroom : " + scores[0].length);
		System.out.println("2dimension length(num of students of second classroom : " + scores[1].length);
		System.out.println(scores[1][1]);
		
		int class1Sum = 0;
		
		for  (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		} 
		
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("first class avg : ");
		
		
		
		int class2Sum = 0;
		
		for (int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}

		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println(class2Avg);
		
		
		int totalStudent = 0;
		int totalSum = 0;
		
		for (int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for (int k = 0; k< scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생 평균 : " + totalAvg);
		
	}

}


