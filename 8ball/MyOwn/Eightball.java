import java.util.Scanner;

/**
 * 
 * @author Nick Brady
 * @version 9/17/2021
 */
public class Eightball {
    /**
     * The main contains the complete logic for the magic 8-ball application.
     * 
     * @param args Command-line arguments. Not used.
     */
    public static void main(String[] args) {
        Scanner keyboard; // Input Stream
        String wantToAsk; // User input: want to ask a question
        String question; // User input: the question
        String answer; // The programs answer

        keyboard = new Scanner(System.in);
        System.out.printf("Do you want to ask a question (yes/no)? ");
        wantToAsk = keyboard.nextLine();
        System.out.println();

        if (!wantToAsk.equalsIgnoreCase("Yes")) {
            System.out.print("Goodbye\n");
            return;
        }

        // get the second input
        System.out.printf("What is your question?\n");
        question = keyboard.nextLine();

        if (!isQuestionValid(question)) {
            System.out.println("Goodbye!");
            return;
        }

        answer = randomAnswer();

        // output the results
        System.out.printf("Question: %s\n", question);
        System.out.printf("  Answer: %s\n", answer);

    }

    /**
     * Check the user's question to verify that it is short enough.
     * 
     * @param question The text of the user's question.
     * @return true if the question is valid, false otherwise
     */

    public static boolean isQuestionValid(String question) {
        boolean valid;

        valid = true;

        if (question.length() > 60) {
            System.out.print("Your question is too long. Be more concise.\n");
            valid = false;
        }

        return valid;
    }

    /**
     * Randomly select one of the possible magic 8-ball answers.
     * 
     * @return The randomly selected answer
     */

    public static String randomAnswer() {
        String answerStr;
        int answerIndex;

        // pick a random answer
        answerIndex = (int) (Math.random() * 20 + 1);
        switch (answerIndex) {
            case 1:
                answerStr = "Signs point to yes.";
                break;
            case 2:
                answerStr = "Yes.";
                break;
            case 3:
                answerStr = "Reply hazy, try again.";
                break;
            case 4:
                answerStr = "Without a doubt.";
                break;
            case 5:
                answerStr = "My sources say no.";
                break;
            case 6:
                answerStr = "As I see it, yes.";
                break;
            case 7:
                answerStr = "You may rely on it.";
                break;
            case 8:
                answerStr = "Concentrate and ask again.";
                break;
            case 9:
                answerStr = "Outlook not so good.";
                break;
            case 10:
                answerStr = "It is decidedly so.";
                break;
            case 11:
                answerStr = "Better not tell you now.";
                break;
            case 12:
                answerStr = "Very doubtful.";
                break;
            case 13:
                answerStr = "Yes - definitely.";
                break;
            case 14:
                answerStr = "It is certain.";
                break;
            case 15:
                answerStr = "Cannot predict now.";
                break;
            case 16:
                answerStr = "Most likely.";
                break;
            case 17:
                answerStr = "Ask again later.";
                break;
            case 18:
                answerStr = "My reply is no.";
                break;
            case 19:
                answerStr = "Outlook good.";
                break;
            case 20:
                answerStr = "Don't count on it.";
                break;
            default:
                answerStr = "HUH?";
                break;
        }
        return answerStr;
    }

}