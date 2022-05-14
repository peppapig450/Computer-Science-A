import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class GetGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name (first last): ");
        String fullName = input.nextLine();

        System.out.print("Filename: ");
        String fileName = input.nextLine();

        input.close();

        int[] grades = ThreadLocalRandom.current().ints(5, 1, 100).toArray();

        System.out.println("\n" + "Here are your randomly-selected grades (hope you pass):");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName));

            buffer.write(fullName);
            buffer.newLine();

            StringBuffer out = new StringBuffer();

            for (int grade : grades) {
                out.append(Integer.toString(grade) + " ");
            }

            String line = out.toString();

            buffer.write(line);
            buffer.close();
            System.out.println("\n" + "Data saved in " + "\"" + fileName + "\"");
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
