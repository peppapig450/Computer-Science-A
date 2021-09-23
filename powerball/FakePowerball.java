import java.util.*;

public class FakePowerball {
    public static void main(String[] aStrings) {
        Scanner scan = new Scanner(System.in);
        int l1 = 1 + (int) (Math.random() * 69);
        int l2 = 1 + (int) (Math.random() * 69);
        int l3 = 1 + (int) (Math.random() * 69);
        int l4 = 1 + (int) (Math.random() * 69);
        int l5 = 1 + (int) (Math.random() * 69);
        int l6 = 1 + (int) (Math.random() * 69);

        System.out.println("Enter your Powerball numbers in order: ");
        int p1 = scan.nextInt();
        int p2 = scan.nextInt();
        int p3 = scan.nextInt();
        int p4 = scan.nextInt();
        int p5 = scan.nextInt();

        int p6 = scan.nextInt();
        scan.close();

        System.out.println(
                "\nThis weeks Powerball drawing: " + l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5 + " " + l6);
        System.out.println("Your numbers were: " + p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5 + " " + p6);
        String w = "\nCongratulations you won! ";

        // if (l1 == p1 && l2 == p2 && l3 == p3 && l4 == p4 && l5 == p5 && l6 == p6) {
        // System.out.println(w);
        // } else {
        // System.out.println("\n You didn't win better luck next time.");
        // }
        if (l1 == p1) {
            if (l2 == p2) {
                if (l3 == p3) {
                    if (l4 == p4) {
                        if (l5 == p5) {
                            if (l6 == p6) {
                                System.out.println(w);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("\n You didn't win better luck next time.");
        }
    }
}
