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
			cm.processInput(x); // this processes the chosen input
		} while (x != 5); // this is when the program exits

	}
	
	public void processInput(int selection) {
			if (selection == 1) {
				createComputer();
			}
			else if (selection == 2) {
				displayComputers();
			}
			
			else if (selection == 3) {
				displayComputers();
				Computer c = selectComputer();
				System.out.println("Please enter a processor speed for the computer");
				int proc = s.nextInt();
				while (proc < 1) {
					System.out.println("Invalid value. Please enter a positive value");
					proc = s.nextInt();
				}
				c.setProcessor(proc);
				System.out.println("Here is the computer's status after it was analyzed");
				System.out.println(c);
				}
	
			
			else {
				displayComputers();
				Computer c = selectComputer();
				System.out.println("How much memory would you like to add?");
				int mem = s.nextInt();
				while (mem < 0) {
					System.out.println("invalid amount, please enter a positive number ");
					mem = s.nextInt();
				}
				c.addMemory(mem);
				System.out.println("Here is what the computer looks like after adding the memory");
				System.out.println(c);
			}
			}
	
		private void displayComputers() {
			for (int i = 0; i < computers.size(); i++) {
				System.out.println((i+1) + ".)" + computers.get(i));
			}
		}
		
		private Computer selectComputer() {
			System.out.println("Please select a computer: ");
			int selection = s.nextInt();
			while (selection < 1 || selection > computers.size()) {
				System.out.println("Invalid selection, please try again: ");
				selection = s.nextInt();
			}
			return computers.get(selection-1);
		}
		
		private void createComputer() {
			System.out.println("Please enter the memory that the computer has");
			int mem = s.nextInt();
			while (mem < 1) {
				System.out.println("Inalid value. Please enter a positive value");
				mem = s.nextInt();
			}
			
			System.out.println("Please enter a processor speed for the computer");
			int proc = s.nextInt();
			while (proc < 1) {
				System.out.println("Inalid value. Please enter a positive value");
				proc = s.nextInt();
			}
			
			System.out.println("Please enter a size for the computer");
			int size = s.nextInt();
			while (size < 1) {
				System.out.println("Inalid value. Please enter a positive value");
				size = s.nextInt();
				
			System.out.println("Please enter a brand for the computer");
			String brand = s.next();
			
			computers.add(new Computer(mem, size, proc, brand));
			}
		}
	}


