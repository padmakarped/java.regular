import java.io.*;
import java.util.Scanner;

public class StudentManagementSystem {

    // File path where student data will be stored
    static final String FILE_NAME = "C:\\Users\\HP\\OneDrive\\Desktop\\Students.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.out.println("Program exited successfully.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // ================= ADD STUDENT =================
    static void addStudent(Scanner sc) {

        try {
            // Check for duplicate ID
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (isIdExists(id)) {
                System.out.println("Student ID already exists! Use another ID.");
                return;
            }

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.write(id + "," + name + "," + age);
            bw.newLine();
            bw.close();

            System.out.println("Student added successfully!");

        } catch (IOException e) {
            System.out.println("Error while adding student.");
        }
    }

    // ================= VIEW STUDENTS =================
    static void viewStudents() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No student records found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            System.out.println("\nID\tName\tAge");
            System.out.println("------------------------");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);
            }

        } catch (IOException e) {
            System.out.println("Error reading student records.");
        }
    }

    // ================= UPDATE STUDENT =================
    static void updateStudent(Scanner sc) {

        File originalFile = new File(FILE_NAME);
        File tempFile = new File("TempStudents.txt");

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(originalFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == id) {
                    found = true;

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int age = sc.nextInt();

                    bw.write(id + "," + name + "," + age);
                } else {
                    bw.write(line);
                }
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error updating student.");
        }

        if (found) {
            originalFile.delete();
            tempFile.renameTo(originalFile);
            System.out.println("Student updated successfully!");
        } else {
            tempFile.delete();
            System.out.println("Student ID not found.");
        }
    }

    // ================= DELETE STUDENT =================
    static void deleteStudent(Scanner sc) {

        File originalFile = new File(FILE_NAME);
        File tempFile = new File("TempStudents.txt");

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(originalFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == id) {
                    found = true;   // skip record
                    continue;
                }
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error deleting student.");
        }

        if (found) {
            originalFile.delete();
            tempFile.renameTo(originalFile);
            System.out.println("Student deleted successfully!");
        } else {
            tempFile.delete();
            System.out.println("Student ID not found.");
        }
    }

    // ================= CHECK UNIQUE ID =================
    static boolean isIdExists(int id) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (Integer.parseInt(data[0]) == id) {
                    return true;
                }
            }

        } catch (IOException e) {
            return false;
        }
        return false;
    }
}
