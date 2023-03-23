
/*
 * Author:  Akpoguma Oghenerukevwe
 * Professor:Dave Houtman
 * Date: 1st December, 2022
 * Description: Lab Exam 02 (22F) Section 323
 */

import java.util.Scanner;
/*
 * Class to allow user enter input which will then be used to determine if the total price is within or out of range
 */
public class Program { 
    /*
     * entry point for the program
     */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); //instantiation of new Scanner object
		double volume;
		double pricePerLitre;
		String shouldContinue;
		String report;
		
		Gasoline gasoline = new Gasoline (); // instantiation of new Gasoline object
		
		do {
			System.out.print("enter volume:");
			volume = keyboard.nextDouble();
			gasoline.setVolume(volume);
			keyboard.nextLine();
			
			System.out.print ("enter pricePerLire:");
			pricePerLitre = keyboard.nextDouble();
			gasoline.setPricePerLitre(pricePerLitre);
			keyboard.nextLine();
			
			report = gasoline.checkTotalPrice();
			System.out.println (report);
			
			System.out.print("would you like to enter more numbers (y/n):");
			shouldContinue= keyboard.nextLine();
			
		}while (shouldContinue.equalsIgnoreCase("Y"));
		
		System.out.print("program by Akpoguma Oghenrukevwe");
	}

}
