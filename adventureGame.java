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
			System.out.println("You find a sewer and enter it...");
			System.out.println("You immediately regret your decision");
	}else if (choice1 == 2){
		System.out.println("You search the streets looking for any sign of an inn");
		System.out.println("You are unsuccussful at finding an inn");
		System.out.println("You are now very tired");
	}else{
		System.out.println("You search for a guard or a castle, you find one guard and approach");
		
	}

}
}
