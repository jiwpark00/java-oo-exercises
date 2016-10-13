
public class Student {
	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
