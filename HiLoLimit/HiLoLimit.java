import java.util.Scanner;

public class HiLoLimit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secret, tries, guess;

        secret = 1 + (int) (Math.random() * 100);
        tries = 0;
        guess = -1;

        while (guess != secret && tries != 7) {
            tries += 1;
            System.out.print("I'm thinking of a number between 1-100. You have 7 guesses. ");
            guess = keyboard.nextInt();
            if (guess != secret && guess > secret && tries < 7) {
                System.out.println("Sorry you are too high, try again.");
            } else if (guess != secret && guess < secret && tries < 7) {
                System.out.println("Sorry you are too low, try again.");
            } else if (guess != secret && tries == 7) {
                System.out.println("Sorry you didnt guess it in 7 tries. You lose.");
            } else {
                System.out.println("You guessed it! What are the odds?!?");
            }
        }
        keyboard.close();
    }
}