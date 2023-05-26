package giraffe;
import java.util.Scanner;

public class App29_MultipleChoiceQuiz {

	public static void main(String[] args) {

		String q1 = "What color are apples?\n"
				+ "(a)Red/Green\n(b)Orange\n(c)Magenta\n";
		
		String q2 = "What color are bananas?\n"
				+ "(a)Red/Green\n(b)Yellow\n(c)Blue\n";
		
		Question [] questions = {
				new Question(q1, "a"),
				new Question(q2, "b")
		};
		
		takeTest(questions);
	}
	
	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i=0; i< questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)){
				score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
		keyboardInput.close();
	}
}
