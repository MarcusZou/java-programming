package giraffe;

public class App23_NestedLoops {

	public static void main(String[] args) {
		
		// 2D Arrays
		int [][] numberGrid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		//System.out.println( numberGrid[1][2] );
		
		// nested Loops
		for(int i = 0; i < numberGrid.length; i++) {
			
			for(int j = 0; j < numberGrid[i].length; j++) {
				System.out.print( numberGrid[i][j] + " " );
			}
			System.out.println();
		}

	}

}
