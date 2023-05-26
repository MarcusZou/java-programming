package giraffe;

public class App14_ReturnStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = cube(3);
		System.out.println( myNum );

	}
	
	public static int cube(int numberToCube) {
		return (numberToCube * numberToCube * numberToCube);
	}

}
