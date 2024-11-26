package Fest;

//Date: 26/11/2024
//Title: The give case study implements OOC principles 

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
// ** Main Class
//  */
public class EventMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int choice = scanner.nextInt();
		try {
			do {
				System.out.println("--Events--");
				System.out.println("1.InfoFest Schedule: ");
				System.out.println("2.HackaFest Schdule: ");
				System.out.println("3.Dates of Events: ");
				System.out.println("4.Exit");
				System.out.println("Enter your Choice: ");
			
			
			
			} while(choice != 4); {
				System.out.println("!!!Invalid Option. Please try again!!!!");
			
				switch(choice) {
					case 1:
						System.out.println("INFOFEST is an annual event of Computer Science and Technology Discipline.");
						System.out.println("The Schedule for the Event is as follows:");
						System.out.println("On First Day the events are:");
						System.out.println("");
				
					case 2:
						System.out.println("HACKAFEST is an 24 hour overnight hackathon.");
						System.out.println("The Schedule for the Event is as follows:");
						System.out.println("On First Day the events are:");
						System.out.println("");
				
					case 3:
						System.out.println("Dates for INFOFEST Event are as follows:");
						System.out.println("First Day: 12th December 2024");
						System.out.println("Second Day: 13th December 2024");
						System.out.println("Third Day: 14th Decenber 2024");
						System.out.println("Dates for HACKAFEST Event are as follows:");
						System.out.println("First Day: 12th December 2024");
						System.out.println("Second Day: 13th December 2024");
				
					case 4:
						System.out.println("You have Exited from the program!!!!!");
				
				
				
				}
			}
		} catch (InputMismatchException) {
			System.err.println("MisMatch Input Error.Please Enter correctly");
		}
		finally {
			System.out.println("The Program has been successfully executed!!");
		}
		scanner.close();
	}
	

}
