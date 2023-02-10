import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int attempt = 1;
		int userGuessNumber = 0;
		int secretNumber = (int) (Math.random() * 99 + 1);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Guess Number Game. \n You will be asked to guess a number.");
		
		do {
			System.out.println("Enter a Guess Number between 1 to 100");
			if(userInput.hasNext()) 
			{
				userGuessNumber = userInput.nextInt();
				if(userGuessNumber == secretNumber)
				{
					System.out.println("Wohoo!\nYou Guess coreect number...\nYou win the game...");
					break;
				}
				else if(userGuessNumber < secretNumber)
					System.out.println("You Guesses smaller number...");
				else if(userGuessNumber > secretNumber)
					System.out.println("You Guesses Greater number...");
				if(attempt == 5) {
					System.out.println("You exceede the maximum attempts :( \n Try Again...");
					break;
				}
				attempt++;
			}
			else {
				System.out.println("Number should be between 1 to 100...\nEnter a valid number...");
				break;
			}
		}while(userGuessNumber != secretNumber);

	}

}
