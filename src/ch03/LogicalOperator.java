package ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((65<=charCode) & (charCode<=90)) {
			System.out.println("대문자이군요.");
		}
		if ((97<=charCode) && (charCode<=122)) {
			System.out.println("소문자이군요.");
		}
		if ((48<=charCode) && (charCode<=57)) { //48~57
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		
		
		
	}

}
