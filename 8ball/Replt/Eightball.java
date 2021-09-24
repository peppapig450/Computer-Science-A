import java.util.*;

public class Eightball {
    public static void main(String[] args) {
        String a = "It is certain.";
        String b = "It is decidedly so.";
        String c = "Without a doubt.";
        String d = "Yes, definitely.";
        String e = "As I see it, yes.";
        String f = "Most likely.";
        String g = "Outlook good.";
        String h = "Yes.";
        String i = "Signs point to yes.";
        String j = "Reply hazy, try again.";
        String k = "Ask again later.";
        String l = "Better not tell you now.";
        String m = "Cannot predict now.";
        String n = "Concentrate and ask again.";
        String o = "Don't count on it.";
        String p = "My reply is no.";
        String q = "My sources say no.";
        String r = "Outlook not so good.";
        String s = "Very doubtful.";
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter your question and I will answer it: ");
        String question = scan.nextLine();
        int answer = (int) (Math.random() * 19) + 1;
        // Use if statements to test the random number
        // and print out 1 of 8 random responses
        if (answer == 1) {
            System.out.println(a);
        } else if (answer == 2) {
            System.out.println(b);
        } else if (answer == 3) {
            System.out.println(c);
        } else if (answer == 4) {
            System.out.println(d);
        } else if (answer == 5) {
            System.out.println(e);
        } else if (answer == 6) {
            System.out.println(f);
        } else if (answer == 7) {
            System.out.println(g);
        } else if (answer == 8) {
            System.out.println(h);
        } else if (answer == 9) {
            System.out.println(i);
        } else if (answer == 10) {
            System.out.println(j);
        } else if (answer == 11) {
            System.out.println(k);
        } else if (answer == 12) {
            System.out.println(l);
        } else if (answer == 13) {
            System.out.println(m);
        } else if (answer == 14) {
            System.out.println(n);
        } else if (answer == 15) {
            System.out.println(o);
        } else if (answer == 16) {
            System.out.println(p);
        } else if (answer == 17) {
            System.out.println(q);
        } else if (answer == 18) {
            System.out.println(r);
        } else if (answer == 19) {
            System.out.println(s);
        }
        scan.close();
    }
}