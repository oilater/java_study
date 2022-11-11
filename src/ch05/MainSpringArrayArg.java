package ch05;

public class MainSpringArrayArg {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("lack");
			System.exit(0); // 프로그램 강제 종료
		}
String strNum1 = args[0];
String strNum2 = args[1];


	}

}
