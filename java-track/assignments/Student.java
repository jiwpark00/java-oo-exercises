
public class Student {
	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;

	// Below is the constructor for Freshman Student
	public Student(String firstName, String lastName, int StudentID) {
		this.Name = firstName + " " + lastName;
		this.StudentID = StudentID;
		this.Credits = 0;
		this.GPA = 0.0;
	}
	
	public Student(String firstName, String lastName, int StudentID, int Credits, double GPA) {
		this.Name = firstName + " " + lastName;
		this.StudentID = StudentID;
		this.Credits = Credits;
		this.GPA = GPA;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getStudentID() {
		return StudentID;
	}
	
	public int getCredits() {
		return Credits;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	} // This sets the Name to the defined String.
	
	public void setStudentID(int StudentID) {
		this.StudentID = StudentID;
	}
	
	public void setCredits(int Credits) {
		this.Credits = Credits;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public String getClassStanding() {
		if (this.Credits < 30) {
			return "Freshman";
		}
		else if (this.Credits < 60) {
			return "Sophomore";
		}
		else if (this.Credits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
	
	public void submitGrade(double newCourseGrade, int newCourseCredits) {
		double qualityScore = newCourseGrade*newCourseCredits;
		double oldQualityScore = this.GPA*this.Credits;
		this.Credits = this.Credits + newCourseCredits;
		double totalQualityScore = oldQualityScore + qualityScore;
		
		this.GPA = (Math.round( (double) totalQualityScore*1000.0/this.Credits)/1000.0);
	}
	
	public double computeTuition() {
		
		// Printing this gives initially
		// System.out.println(this.Credits); as 1
		// which means, we start with 1 credit.
		// But, 1 credit still costs $20000.
		// NVM - checked the updated StudentAndCourseTest.java and that passes.
		
		int semester = this.Credits/15;
		int leftoverCredits = this.Credits % 15;
		
		return 20000.0*semester + Math.round(20000.0/15*100.0)/100.0*leftoverCredits;
	}
	
	public Student createLegacy(Student parent1, Student parent2) {
		return new Student(parent1.getName(), parent2.getName(),
				parent1.getStudentID()+parent2.getStudentID(),
				Math.max(parent1.getCredits(), parent2.getCredits()),
				(parent1.getGPA()+parent2.getGPA())/2.0);
		
		// This essentially creates a new Student object through existing two Students
		// #Legacy
	}
	
	public String toString() {
		return this.getName() + Integer.toString(this.getStudentID());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3-decimal place testing System.out.println(Math.round(Math.random()*10.0)/10.0);
	}

}
