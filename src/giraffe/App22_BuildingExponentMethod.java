package giraffe;

public class App22_BuildingExponentMethod {

	public static void main(String[] args) {
		
		System.out.println( pow(4, 5));

	}
	
	public static int pow(int baseNum, int powNum) {
		int result = 1;
		for(int i = 0; i < powNum; i++) {
			result = result * baseNum;
		}
		return result;
	}

}
