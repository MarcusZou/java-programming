package giraffe;

public class App15_If_Statement {

	public static void main(String[] args) {
		
		boolean isMale = false;
		boolean isTall = true;
		
		// boolean operators:
		//   and: &&
		//   or: ||
		//   not: !
		if(isMale && isTall) {
			System.out.println("You are a tall male");
		} else if(isMale && !isTall) {
			System.out.println("You are a short male");
		} else if(!isMale && isTall){
			System.out.println("You are not a male, but tall");
		}else {
			System.out.println("You are not male, and not tall");
		}

	}

}
