
public class Rectangle {
	// Fields
	private int length;
	private int width;
	
	// Behaviors
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public static int getArea(int length, int width) {
		return length*width;
	}
	
	public static int getPerimeter(int length, int width) {
		return 2*(length+width);
	}
	
	public  String compareArea(int newLength, int newWidth) {
		if (getArea(this.length, this.width) >getArea(newLength,newWidth)) {
			return "Old is bigger";
		}
		else {
			return "New is not bigger";
		}
	}
	
	public static void main(String args[]) {
		System.out.println(getArea(4,5));
		System.out.println(getPerimeter(4,5));
	}
}
