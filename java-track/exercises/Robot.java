
public class Robot {
	// Fields
	private String name;
	private int x_position;
	private int y_position;
	private int speed;
	private String orientation;
	//
	
	public Robot(String name, int x_position, int y_position, int speed, String orientation) {
		this.name = name;
		this.x_position = x_position;
		this.y_position = y_position;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public int giveXPos() {
		return x_position;
	}
	
	public int giveYPos() {
		return y_position;
	}
	
	public String giveName() {
		return name;
	}
	
	public String giveOriginalOrientation() {
		return orientation;
	}
	
	public String giveOrientation() { // Minimalistic script. Don't feel like designing it all
		if (this.orientation == "north") {
			return "west";
		}
		else if (this.orientation == "south") {
			return "east";
		}
		else if (this.orientation == "east") {
			return "north";
		}
		else {
			return "south";
		}
	}
	
	public double giveDistance(Robot r1) {
		double distance = Math.sqrt( Math.pow(r1.giveXPos() - this.giveXPos(),2) +
				Math.pow(r1.giveYPos() - this.giveYPos(),2) ); 
		return ((double) distance*1000.0)/1000.0;
	}
	
	public static void main(String args[]) {
		Robot robot1 = new Robot("Watson",0,0,15,"north");
		Robot robot2 = new Robot("Monica",3,4,10,"south");
		System.out.println(robot1.giveName());
		System.out.println(robot1.giveOrientation());
		
		double dist = robot1.giveDistance(robot2);
		System.out.println(dist);
	}
}
