import java.util.ArrayList;
import java.util.Scanner;

public class ComputerMenu {
	
	private ArrayList<Computer> computers;
	private Scanner s;
	
	public ComputerMenu() {
		s = new Scanner(System.in); // System.in means that the input is from the console.
		computers = new ArrayList<Computer>(); // starts a new empty array
	}
	
	public int startMenu() {
		System.out.println("Welcome to the computer menu!");
		System.out.println("1. Create a computer");
		System.out.println("2. Display a list of available computers");
		System.out.println("3. Change the processor of the computer");
		System.out.println("4. Add memory to the computer");
		System.out.println("5. Exit");
		System.out.println("Please select an option: ");
		int selection = s.nextInt(); // selects next line as the input. Fails if it's not an integer
		while (selection < 0 || selection > 5) {
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		ComputerMenu cm = new ComputerMenu();
		do {
			x = cm.startMenu(); // this prints out the start menu
			//cm.processInput(x); // this processes the chosen input
		} while (x != 5); // this is when the program exits

	}

}
