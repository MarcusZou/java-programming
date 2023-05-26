package giraffe;

public class App26_ClassesObjects {

	public static void main(String[] args) {
		
		// Class --> an entity in real world with properties and actions
		// myStudent is an object
		// an object is an instance of a class
		
		Student myStudent = new Student();
		myStudent.firstName = "Jim";
		myStudent.lastName = "Halpert";
		myStudent.major = "Business";
		myStudent.gpa = 2.3;
		myStudent.age = 24;
		myStudent.onProbation = false;
		
		Student myStudent2 = new Student();
		myStudent2.firstName = "Pam";
		myStudent2.lastName = "Beasley";
		myStudent2.major = "Art";
		myStudent2.gpa = 2.5;
		myStudent2.age = 23;
		myStudent2.onProbation = true;
		
		System.out.println( myStudent.gpa );
		System.out.println( myStudent2.firstName );
		
	}

}
