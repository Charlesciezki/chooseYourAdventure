package chooseYourOwnAdventure;

import java.util.Scanner;

public class chooseTheCastle extends adventureGame{
public void chooseCastle(int choice1){
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
		System.exit(0);
	}else {
		System.out.println("You attack him with your fists. You loose");
		System.out.println("Game over");
		System.exit(0);
}
}
}
