package giraffe;

public class App16_If_Comparison {

	public static void main(String[] args) {
		
		System.out.println(max(300, 40, 5));

	}
	
	public static int max(int num1, int num2, int num3) {
		// Comparison operators:
		// >, <, >=, <=, ==, !=
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		} else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}
	}

}
