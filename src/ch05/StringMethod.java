package ch05;

import java.awt.datatransfer.Clipboard;

public class StringMethod {

	public static void main(String[] args) {
		String board = "1, 자바 학습, 참조 타입 stirng 공부중";
		String[] tokens = board.split(",");
		
		for (int i = 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		
		
		/*
		 * String subject = "자바 프로그래밍";
		 * 
		 * int location = subject.contains("자바"); System.out.println(location);
		 */
		
//		String substring = subject.substring(location);
//		System.out.println(substring);
//		
//		
//		if(location == -1) {
//			System.out.println("x");
//			
//		}
//		
//		boolean result = subject.contains("자바");
//		
//		if (result) {
//			
//		System.out.println("related");
//		} else {
//			System.out.println("un-related");
//		}
//		
		
		
		
		
		
		/*
		String ssn = "950624-1230123";
		String firstName = ssn.substring(0,6);
		System.out.println(firstName);
		
		String secondName = ssn.substring(7);
		System.out.println(secondName);
		*/
		
		//		String ssn = "9506241230123"; // 주민번호
//		char sex = ssn.charAt(6);
//		int length = ssn.length();
//		
//		if (length == 13) {
//			
//		System.out.println("right");
//		} else {
//			System.out.println("false");
//		}
//
//		switch (sex) {
//		case'1' :
//		case'3' : 
//			System.out.println("men");
//			break;
//		case'2' :
//		case'4' :
//			System.out.println("girl");
//			break;
//		}
	
	}

}
