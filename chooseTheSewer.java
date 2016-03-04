package chooseYourOwnAdventure;
import java.util.*;


public class chooseTheSewer extends adventureGame{
public void theSewer(int choice1){
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
			System.exit(0);
		}else{
			System.out.println("You can't take the smell, you plug your nose and run out the way you came");
			System.out.println("Upon exiting, you come onto a crowd of silent people stareing at you as you come from the sewers");
			
		}
}
}
