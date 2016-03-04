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
			System.out.println("What do you do now?");
			System.out.println("Enter 1 to continue onward");
			System.out.println("Enter 2 to leave");
				Scanner choiceTwo = new Scanner (System.in);
				int choice2 = choiceTwo.nextInt();
				if (choice2 == 1){
					System.out.println("You continue onward, you step in poop and fall and your leg is now shattered. You have an infection.");
					System.out.println("You pass out due to the extreme pain, you die in your sleep from blood loss.");
					System.out.println("Game Over.");
				}else{
					System.out.println("You can't take the smell, you plug your nose and run out the way you came");
					System.out.println("Upon exiting, you come onto a crowd of silent people stareing at you as you come from the sewers");
					
				}
	}else if (choice1 == 2){
		System.out.println("You search the streets looking for any sign of an inn");
		System.out.println("You are unsuccussful at finding an inn");
		System.out.println("You are now very tired");
			
			System.out.println("Since you are so tired you can either laty down for  moment or continue on...");
			System.out.println("Enter 1 to lay down in the alley");
			System.out.println("Enter 2 to continue to search for an inn");
			Scanner choiceinn = new Scanner(System.in);
			int choiceInn = choiceinn.nextInt();
			if (choiceInn == 1){
				System.out.println("You are awoken by a strange crowd of people...");
			}else{
				System.out.println("You press on and soon enough you turn a corner and there is a crowd of people waiting for you...");
			}
			
	}else{
		System.out.println("You search for a guard or a castle, you find one guard and approach");
			
			System.out.println("He looks at you with a blank stare...");
			System.out.println("Enter 1 if you wish to ask him where the castle is.");
			System.out.println("Enter 2 if you wish to remain silent and wait for him to speak");
			System.out.println("Enter 3 to attack the guard");
			Scanner choicecastle = new Scanner(System.in);
			int choiceCastle = choicecastle.nextInt();
			if (choiceCastle == 1){
				System.out.println("He points to an alley, you go down only to find a crowd of people waiting for you...");
				System.out.println("You're met with more blank stares...");
				System.out.println("You have an uneasy feeling");
			}else if (choiceCastle == 2){
				System.out.println("The longer you wait to speak the more visibly angry the guard is becoming");
				System.out.println("He impales you due to his excessive anger.");
				System.out.println("Game Over.");
			}else {
				System.out.println("You attack him with your fists. You loose");
				System.out.println("Game over");
			}
			System.out.println("The crowd gathers close...");
			System.out.println("Before you can react they start to change...");
			System.out.println("At first you see the scales, next the teeth");
			System.out.println("You've stepped into a Dragonkin town, and as it turns out, they have a taste for human...");
			System.out.println("Game over.");
	}
		
}
}
