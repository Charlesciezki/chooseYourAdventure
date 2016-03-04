package chooseYourOwnAdventure;
import java.text.*;
import java.util.*;
import java.io.*;


public class adventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You awake in the middle of a strange town, you look around and no one is here what do you do?");
		System.out.println("Enter 1 to go into the sewers");
		System.out.println("Enter 2 to go to the inn");
		System.out.println("Enter 3 to go to try to find a castle");
		Scanner choiceOne = new Scanner(System.in);
		int choice1 = choiceOne.nextInt();
	if (choice1 == 1){
			chooseTheSewer sewer = new chooseTheSewer();
			sewer.theSewer(choice1);
			
	}else if (choice1 == 2){
		chooseTheInn Inn = new chooseTheInn();
		Inn.chooseInn(choice1);
			
	}else{
		chooseTheCastle Castle = new chooseTheCastle();
		Castle.chooseCastle(choice1);
		
			}
			System.out.println("The crowd gathers close...");
			System.out.println("Before you can react they start to change...");
			System.out.println("At first you see the scales, next the teeth");
			System.out.println("You've stepped into a Dragonkin town, and as it turns out, they have a taste for human...");
			System.out.println("Game over.");
	}
		
}

