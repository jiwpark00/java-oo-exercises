
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
		else {
			return "east";
		}
	}
	
	
	public static void main(String args[]) {
		Robot robot1 = new Robot("Watson",0,0,15,"north");
		System.out.println(robot1.giveName());
		System.out.println(robot1.giveOrientation());
	}
}
