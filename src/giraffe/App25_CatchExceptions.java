package giraffe;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App25_CatchExceptions {

	public static void main(String[] args) {

		// Catch and Exceptions
		Scanner keyboardInput = new Scanner(System.in);
		
		int [] nums = {1, 2, 3};
		
		System.out.print("Enter a number: ");
		
		try {
//			System.out.println(nums[5]);
			
			double num = keyboardInput.nextDouble();
			System.out.println( num );
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( e );
		} catch(InputMismatchException e) {
			System.out.println( "Invalid Input" );
		} catch(Throwable e) { //Throwable = Error + Exception
			System.out.println( e );
		}
		keyboardInput.close();
	}

}
