import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */
class MagpieRunner {
        public static void main(String[] args) {
                Magpie maggie = new Magpie();
                System.out.println(maggie.getGreeting());
                Scanner in = new Scanner(System.in);
                String statement = in.nextLine();

                while (!statement.equals("Bye")) {
                        System.out.println(maggie.getResponse(statement));
                        statement = in.nextLine();
                }
        }
}