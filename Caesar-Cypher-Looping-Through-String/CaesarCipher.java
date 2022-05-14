import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher {
    public static char shiftLetter(char c, int n) {
        int u = c;

        if (!Character.isLetter(c))
            return c;

        u = u + n;

        if (Character.isUpperCase(c) && u > 'Z'
                || Character.isLowerCase(c) && u > 'z') {
            u -= 26;
        } else if (Character.isUpperCase(c) && u < 'A'
                || Character.isLowerCase(c) && u < 'a') {
            u += 26;
        }

        return (char) u;

    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String plaintext, fileName, cipher = "";
        int shift;

        Scanner plain = new Scanner(new File("TextToCipher.txt"));
        plaintext = plain.next();

        System.out.print("Shift (0-26): ");
        shift = keyboard.nextInt();

        for (int i = 0; i < plaintext.length(); i++) {
            cipher += shiftLetter(plaintext.charAt(i), shift);
        }

        System.out.print("Enter the name of the output file to use: ");
        fileName = keyboard.next() + ".txt";
        keyboard.close();

        plain.close();
        PrintWriter out = new PrintWriter(fileName);
        out.println(cipher);
        out.close();

        System.out.println(cipher);
    }
}