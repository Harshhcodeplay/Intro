import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class program4 {

    static int totalRecordsProcessed = 0;

    public static void main(String args[]) throws IOException {

        System.out.println("--- Command line Argument ---");
        if (args.length > 0) {
            System.out.println("Section provided at launch: " + args[0]);
        } else {
            System.out.println("No command line argument supplied");
        }

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter a student's mark (as text): ");
        String markText = consoleReader.readLine();

        System.out.println("Enter the student's name: ");
        String studentName = consoleReader.readLine();

        int mark = Integer.parseInt(markText.trim());
        Integer boxedMark = mark;     
        int unboxedMark = boxedMark;   

        Scanner tokenScanner = new Scanner("2.5 true 7");
        double bonusPoints = tokenScanner.nextDouble();
        boolean isTopper = tokenScanner.nextBoolean();
        int bonusAttempts = tokenScanner.nextInt();
        tokenScanner.close();

        double finalMark = computeFinalMark(unboxedMark, bonusPoints);
        registerStudent(studentName, finalMark, isTopper);

        System.out.println("\n--- Wrapper Class Parsing Recap ---");
        System.out.println("Partial mark (int) = " + mark + ", bonusAttempts (Scanner int) = " + bonusAttempts);

        System.out.println("\n--- static counter ---");
        System.out.println("Total records processed so far (static field) = " + totalRecordsProcessed);

        System.out.println("Grade based on final mark: " + program4.gradeFor(finalMark));
    }

    static double computeFinalMark(int mark, double bonus) {
        return mark + bonus;
    }

    static void registerStudent(String name, double finalMark, boolean isTopper) {
        totalRecordsProcessed++;
        System.out.printf("%nRegistered: %s | final mark: %.2f | Topper: %b%n", name, finalMark, isTopper);
    }

    static char gradeFor(double mark) {
        if (mark >= 90) return 'A';
        else if (mark >= 75) return 'B';
        else if (mark >= 60) return 'C';
        else return 'D';
    }
}