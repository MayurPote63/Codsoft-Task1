import java.util.*;

public class Guessnum {
    public static void main(String[] args) {
        int totalAttempts = 6; 
        int totalRounds = 3; 
        int score = 0; 
        int attempts = 0; 
        int rounds = 0; 
        Random ran = new Random();
        int numberToGuess = ran.nextInt(100) + 1; 
        Scanner sc = new Scanner(System.in);

        while (rounds < totalRounds) {
            System.out.println("Round " + (rounds + 1));
            System.out.println("Guess any number between up to 100:");
            int guess = sc.nextInt();

            attempts++;

            if (guess == numberToGuess) {
                System.out.println(" congrats,You won first Round !");
                score++;
                rounds++;
            } else if (guess > numberToGuess) {
                System.out.println("Your Guessing is very high, play again!");
            } else {
                System.out.println("your Guessing is very low,play again!");
            }

            if (attempts >= totalAttempts) {
                System.out.println("you finished your attempt , The number is  "  + numberToGuess);
                rounds++;
            }
        }

        System.out.println("Your Score comes " +score+ "out of" +rounds);
    }
}