package chooseYourOwnAdventure;
import java.util.*;


public class crowdSwitchCase extends adventureGame{
	public void crowdChoice(){
		System.out.println("The uneasy feeling within you grows, you realize you have to leave this town.");
		System.out.println("Enter 1 to charge into the crowd and try to push your way through");
		System.out.println("Enter 2 to try to reason with them");
		System.out.println("Enter 3 to try to scare them by opening your coat and yelling");
		System.out.println("Enter 4 to RUN!! RUN FOR YOUR LIFE!!");
		System.out.println("Enter 5 to call to the gods for help");
		System.out.println("Enter 6 to to turn around and run the way you came");
		System.out.println("Enter 7 to take the Skooma you have in your pocket and try anything");

		Scanner finalChoice = new Scanner (System.in);
		int FinalChoice = finalChoice.nextInt();
		
		switch(FinalChoice){

		case 1: System.out.println("You push through a few people and...");
				break;

		case 2: System.out.println("You lift your hands and start speaking with them");
				System.out.println("They don't speak any human language you've ever heard");
				break;

		case 3: System.out.println("You roar and flap your arms around trying to scare them...");
				break;

		case 4: System.out.println("You scream like a child and run the opposite way that you came.");
				System.out.println("Through sheer luck and panic you've managed to exit the city!");
				System.out.println("You leave the city gates and enter Breakwood, another adventure awaits...");
				System.out.println("The game is over but is this the real ending for you?");
				System.exit(0);
				break;

		case 5: System.out.println("You get down and prey for help from the gods");
				System.out.println("You've forgotten for a moment that you are not on good temrs with the gods...");
				System.out.println("They banish you for trying to ask for their help.");
				System.out.println("A portal opens and takes you to a world of fire");
				System.out.println("Game Over");
				System.exit(0);
				break;

		case 6: System.out.println("You take a moment as to not panic,");
				System.out.println("As you clear your mind you clearly remember the way you came,");
				System.out.println("You steadily run to the entrance of the city");
				System.out.println("You're free!");
				System.out.println("You make your way through Breakwood, and find the city of Bowerview");
				System.out.println("The Game is over. This is the true ending.");
				System.exit(0);
				break;

		case 7: System.out.println("You take the vial out and drink, your vision quickly distorts,");
				System.out.println("your strength as well as your speed increases");
				System.out.println("You thrash your arms about but you black out.");
				System.out.println("Game Over");
				System.exit(0);
				break;

		default: System.out.println("You took too long to make a decision...");
				break;
		}
	}
	
}

