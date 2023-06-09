import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p}aper or [s]cissors: ");
        String playerChoice = scanner.nextLine();
        if (playerChoice.equals("r") || playerChoice.equals("rock")) {
            playerChoice = "Rock";
        } else if (playerChoice.equals("p") || playerChoice.equals("paper")) {
            playerChoice = "Paper";
        } else if (playerChoice.equals("s") || playerChoice.equals("scissors")) {
            playerChoice = "Scissors";
        } else {
            System.out.println("Invalid Input. Try again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";
        switch (computerRandomNumber) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }
        System.out.println("Computer choose "+ computerMove);
        if (playerChoice.equals("Rock") && computerMove.equals("Scissors") || playerChoice.equals("Paper") && computerMove.equals("Rock") || playerChoice.equals("Scissors") && computerMove.equals("Paper")) {
            System.out.println("You win.");
        } else if (playerChoice.equals("Paper") && computerMove.equals("Scissors") || playerChoice.equals("Scissors") && computerMove.equals("Rock") || playerChoice.equals("Rock") && computerMove.equals("Paper")) {
            System.out.println("You lose.");
        }
        else {
            System.out.println("This game was a draw");
        }
    }
}
