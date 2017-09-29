package assignment4_2;

import java.util.Scanner;

// Main Class which executes/shows the relation
public class Relation {
	//	Main Function
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);		//	Scanner to get the user input
		Bajaj bajaj = new Bajaj();		//	Creating the Specific Bike object and setting the data from the user. We are getting these because of "is a" relation
		
		System.out.print("Enter a BIKE name : ");
		bajaj.setBikeName(userInput.nextLine());
		
		System.out.print("Enter Engine CC : ");
		bajaj.setCc(userInput.nextLine());
		
		System.out.print("Enter Top Speed : ");
		bajaj.setTopSpeed(userInput.nextInt());
		
		System.out.println("------------------------------------------------------------");
		bajaj.bikeData();	//	To print the bike info
		
		System.out.println("------------------------------------------------------------");
		bajaj.bikeStartTest(bajaj.getBikeName());
		bajaj.bikeStopTest(bajaj.getBikeName());
		
		//	Note : "HAS-A" relation is better than "IS-A" relation as because "HAS-A" is loose coupled and has better code re-usability. 
		//	Further "IS-A" tightly coupled and any change in the superclass affects its hierarchy to subclasses.  
		userInput.close();
	}
}