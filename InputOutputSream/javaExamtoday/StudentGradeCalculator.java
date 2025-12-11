package InputOutputSream.javaExamtoday;

import java.util.Scanner;


// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class StudentGradeCalculator {

    // Method to validate marks
    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid Marks! Marks must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input marks
            System.out.print("Enter Mark 1: ");
            int m1 = sc.nextInt();
            validateMarks(m1);

            System.out.print("Enter Mark 2: ");
            int m2 = sc.nextInt();
            validateMarks(m2);

            System.out.print("Enter Mark 3: ");
            int m3 = sc.nextInt();
            validateMarks(m3);

            // Calculate average
            double avg = (m1 + m2 + m3) / 3.0;

            // Determine grade
            String grade;
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 75) {
                grade = "B";
            } else if (avg >= 60) {
                grade = "C";
            } else if (avg >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Display result
            System.out.println("\n--- Result ---");
            System.out.println("Average Marks: " + avg);
            System.out.println("Final Grade : " + grade);

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input! Please enter integer values only.");
        }

        sc.close();
    }
}
