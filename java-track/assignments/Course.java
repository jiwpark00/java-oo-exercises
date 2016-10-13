
public class Course {
	
	private String Name;
	private int Credits;
	private int numSeatsLeft;

	public Course(String Name, int Credits, int numSeatsLeft) {
		this.Name = Name;
		this.Credits = Credits;
		this.numSeatsLeft = numSeatsLeft;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getRemainingSeats() {
		return numSeatsLeft;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
