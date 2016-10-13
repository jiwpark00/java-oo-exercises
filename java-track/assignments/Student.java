
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
		
		this.GPA = (Math.round((double) totalQualityScore)*1000.0)/(this.Credits*1000.0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3-decimal place testing System.out.println(Math.round(Math.random()*10.0)/10.0);
	}

}
