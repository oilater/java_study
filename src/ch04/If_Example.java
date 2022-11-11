package ch04;

public class If_Example {

	public static void main(String[] args) {
		int score = 75;
		String name = "SeongHyeon";

		
//		if (score >= 90) {
//			System.out.println(name + "90 high");
//		} else if (score >= 80) { // 거름망
//			System.out.println(name + "80 high");
//		} else if (score >= 70) {
//			System.out.println(name + "is " +"70 high");
//		} else {
//			System.out.println("70 below");
//		}
		
		int num = (int) (Math.random()*6) + 1;
		
//		 if (num == 1) { 
//			 System.out.println("Number 1"); 
//		 } else if (num == 2) {
//			 System.out.println("Number 2"); 
//		 } else if (num == 3) {
//			 System.out.println("Number 3"); 
//		 } else if (num == 4) {
//			 System.out.println("Number 4"); 
//		 } else if (num ==5) {
//			 System.out.println("Number 5"); 
//		 } else if (num ==6) {
//			 System.out.println("Number 6"); 
//		 } 
		
		
		//byte, char, short, int, long
		//String
		
		
		char grade = 'B';
		 switch(grade) {
		 	case 'A': System.out.println("A"); 
		 	break;
		 	case 'B': System.out.println("B"); 
		 	break;
		 	case 'C': System.out.println("C"); 
		 	break;
		 	case 'D': System.out.println("D"); 
		 	break;
		 	case 'E': System.out.println("E"); 
		 	break;
		 	default: System.out.println("F"); 
		 	// 마지막은 default 로 써주며, default 문은 break가 필요가 없다!
		 }
		 
		 
		 
		 
		 
		 
		 
		
	}
}