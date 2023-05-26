package giraffe;

public class Studentc {
	String name;
	String major;
	double gpa;
	
	public Studentc(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	public boolean isOnHonorRoll() {
		if(this.gpa >= 3.5) {
			return true;
		}
		return false;
	}
}
