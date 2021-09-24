import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();
        if (command.equals("n")) {
            System.out.println(
                    "You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
        } else if (command.equals("s")) {
            System.out.println(
                    "You walk down the sea and end up on the beach. \nYou are listening to the waves crashing down and the gulls, when all of a sudden a crab pinches your foot.");
        } else if (command.equals("e")) {
            System.out.println(
                    "You walk to the beach shack and enter the building. \nIn the corner you see something moving, maybe its a wild rat or a bird.");
        } else if (command.equals("w")) {
            System.out.println(
                    "You walk towards the open field when all of a sudden you hear something. \nYou are suddenly trampled by a herd of wild cows and left in critical condition.");
        } else {
            System.out.println("ILLEGAL SELECT A VALID DIRECTION!!!!!!!!!!");
        }
        // Add else-ifs for s, e, and an else for any other input. Be creative!

        System.out.println("End of adventure!");
        scan.close();
    }
}