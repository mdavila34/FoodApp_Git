/*
 * Main menu options and selections
 * 
 * Copyright 2017 Alberto Davila Jr.
 */

/**
 * The main menu class provides the 
 * main menu options that are to be
 * shown after successful login.
 * 
 * @author Alberto Davila Jr.
 * @version 1.0 6/17/17
 */
import static java.lang.System.*;
import java.util.Scanner;
import javax.swing.JOptionPane; // only available in JDK

public class Main_menu {
	public static void main(int args) {

		/// String username = profile.username;
		boolean run = true;
		int option = 0;
		
		// Initiate the menu circulation
		while (run == true) {
			out.println("Welcome to your food pantry menu" + username);
			out.println("What would you like to do?");
			out.println("1. Add items to pantry");
			out.println("2. Look up recipen");
			out.println("3. Remove item from pantry");
			out.println("4. Open pantry");
			out.println("5. Exit application");
			out.println("");
			// I plan on using SQL lite to write the database for the pantry items
			// Any suggestions or help on said database creation would be greatly appreciated!
			try {
				Scanner keyboard = new Scanner(in);
				String input = keyboard.toString(); // note: used to catch non-integer
				option = Integer.parseInt(input, 2); // throws exception if non-integer
				return option;
			}
			catch (NumberFormatException e) {
				out.println("Must enter menu option as integer, try again.");
				break;
			}
			if (option >= 1 && option <= 5) {
				switch (option) {
				case 1: option = 1;
						/// Add items to pantry
						run = false;
				case 2: option = 2;
						// Look up recipe
						run = false;
				case 3: option = 3;
						// remove item from pantry
						run = false;
				case 4: option = 4;
						// open pantry, display foods
						run = false;
				case 5: option = 5;
						// Exit main menu
						run = false;
				default:
					out.println("Invalid integer, choose an option from the menu.");
				}
				
			}
			throw new java.lang.IllegalArgumentException();
		}
		keyboard.close(); 
		return input;
	}
}

/*


testing repository

*/