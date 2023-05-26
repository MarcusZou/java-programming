package giraffe;

public class App18_SwitchStatements {

	public static void main(String[] args) {
		
		System.out.println( getDayName(0));

	}
	
	public static String getDayName(int dayNum) {
		String dayName = "";
		
		switch(dayNum){
		case 0:
			dayName = "Sunday";
			break;
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thurday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Satday";
			break;
		default: dayName = "Invalid Day Number";
			break;
		}
		
		return dayName;
	}

}
