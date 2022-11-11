package ch04;

import java.util.Scanner;

public class KeyControlEx {

	public static void main(String[] args) {
		//1, 2를 입력했을 때 속도를 증가, 감속시키고 3 입력시 종료시키는 프로그램

	Scanner scanner = new Scanner(System.in);
	boolean run = true;
	int speed = 0;
	
	while(run) {
		System.out.println("--------------------");
	
		
		System.out.println("1.Up, 2.Down, 3.Stop1");
		
		
		System.out.println("--------------------");

		
		System.out.println("Select: ");
		
		
		String strNum = scanner.nextLine();
	
		if (strNum.equals("1")) {
			speed++;
			System.out.println("Current speed: " + speed);
		} else if (strNum.equals("2")) {
			speed--;
			System.out.println("Current speed: " + speed);
		} else if (strNum.equals("3")) {
			run = false;
			System.out.println("Exit Program");

		}
	}
		
		
		
	}

}
