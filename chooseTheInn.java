package chooseYourOwnAdventure;

import java.util.Scanner;

public class chooseTheInn extends adventureGame{
	public void chooseInn(int choice1){
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
			
	}
}
