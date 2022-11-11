package ch05;

public class EqualsEX {

	public static void main(String[] args) {
		
		// String 은 리터럴이 같으면 같은 주소를 가리킨다.(참조한다.)
		String strVar1 = "Hong";
		String strVar2 = "Hong";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 and strVar2 's Address is same");
		} else {
			System.out.println("strVar1 and strVar2 's Address is different ");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2 's literal is same");
		}

		
		//new 로 생성하면 같은 값이라도 가리키는 주소가 다르다.
		String strVar3 = new String("Hong");
		String strVar4 = new String("Hong");
			
		if (strVar3 == strVar4) {
			System.out.println("strVar3 and strVar4 's Address is same");
		} else {
			System.out.println("strVar3 and strVar4 's Address is different ");
		}
		
		if (strVar3.equals(strVar4)) {
		}
	}

}
