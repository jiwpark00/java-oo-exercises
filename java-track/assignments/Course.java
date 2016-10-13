
public class Course {
	
	private String Name;
	private int Credits;
	private int numSeatsLeft;
	private Student[] Roster;

	public Course(String Name, int Credits, int numSeats) {
		this.Name = Name;
		this.Credits = Credits;
		this.numSeatsLeft = numSeats;
		this.Roster = new Student[numSeats];
	}
	
	public String getName() {
		return Name;
	}
	
	public int getRemainingSeats() {
		return numSeatsLeft;
	}
	
	public int getCredits() {
		return Credits;
	}
	
	public Student[] getRoster() {
		return Roster; 
	}
	
	public Boolean addStudent(Student newStudent) {
		if (this.numSeatsLeft == 0) { // If it's already full, return false
			return false;
		}
		
		for (int i = 0; i < Roster.length; i++) {
			if (Roster[i] != null) {// If the Roster's entry has student information only.
				if (Roster[i].getName() == newStudent.getName()) {
						// This is if the roster entry already exists.
						return false;
					}
				}
			}
		
		// Now, we will add the student
		// We do minus this.numSeatsLeft because that defines the position.
		// Then we reduce numSeats count by 1 and return true.
		
		Roster[Roster.length - this.numSeatsLeft] = newStudent;
		numSeatsLeft = numSeatsLeft - 1;
		return true;
	}
	
	public double averageGPA() {
		int actualStudentCount = 0;
		double actualStudentGPASum = 0.0;
		
		for (int i = 0; i < Roster.length; i++) {
			if (Roster[i] != null) {
				actualStudentCount += 1;
				actualStudentGPASum += Roster[i].getGPA();
			}
		}
		
		return (double) actualStudentGPASum/actualStudentCount;
		
	}
	
	public String toString() {
		return this.getName() + " " + "(" + this.getCredits() + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
