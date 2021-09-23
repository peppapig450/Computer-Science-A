import java.util.Scanner;

public class GuessAnimal {
    public static void main(String[] args) {
        System.out.println("\n\nLet's play 20 questions. Choose an animal and I will try to guess it!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Is it a mammal (y/n)?");
        String answer = scan.nextLine();
        if (answer.equals("y")) {
            System.out.println("Is it a pet (y/n)?");
            answer = scan.nextLine();
            if (answer.equals("y")) {
                System.out.println("Does it bark (y/n)?");
                answer = scan.nextLine();
                if (answer.equals("y")) {
                    System.out.println("I guess a dog! Click on run to play again.");
                } else {
                    System.out.println("I guess a cat! Click on run to play again.");
                }
            } else {
                System.out.println("I guess an elephant! Click on run to play again.");
            }
        } else { // not a mammal
            System.out.println("Does it fly (y/n)?");
            answer = scan.nextLine();
            if (answer.equals("y")) {
                System.out.println("I guess a bird! Click on run to play again.");
            } else {
                System.out.println("I guess a turtle! Click on run to play again.");
            }
        }
    }
}