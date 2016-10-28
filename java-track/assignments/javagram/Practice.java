package javagram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean stillgoing = true;
		
		do {
		try {
		     String s = scan.nextLine();
		     int x = Integer.parseInt(s);
		     stillgoing = false;
		}
		catch(NumberFormatException ex)
		{
			System.out.println("This isn't an integer!");
		} 
		} while (stillgoing == true);
	}
}
