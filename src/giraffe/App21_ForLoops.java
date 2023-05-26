package giraffe;

public class App21_ForLoops {

	public static void main(String[] args) {
		
		// while loop
		System.out.println("While Loop:");
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// for loop - simpler than while loop, isn't it?
		System.out.println("For Loop:");
		for(int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		
		// for loop - another example
		String [] friends = {"Jim", "Angela", "Oscar", "Dwight"};
		System.out.println("Another For Loop:");
		for(int k = 0; k < friends.length; k++) {
			System.out.println( friends[k] );
		}

	}

}
