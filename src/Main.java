import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);  // Create a Scanner object

    public int getIntInput(Scanner input) {
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    public static void main(String[] args) {
        Main system = new Main();
        system.run();
    }

    public void run() {
        try {
            int choice;
            do {
                System.out.println("\nWelcome to the interfaces.Vehicle Information System!\nHere are the options:");
                System.out.println("1. models.Car");
                System.out.println("2. models.Motorcycle");
                System.out.println("3. models.Truck");
                System.out.println("4. Calculate overall course grades");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: "); // The print() method does not move the cursor to a new line.

                // Get the user's choice
                choice = getIntInput(input);

                // Switch statements to perform actions based on the user's choice
                switch (choice) {
                    case 1:
                        System.out.print("Enter course code: ");
                        String courseCode = input.nextLine(); // Read a String value from the user

                        System.out.print("Enter course name: ");
                        String courseName = input.nextLine();

                        System.out.print("Enter course maximum capacity: ");
                        int maxCapacity = getIntInput(input);

                        break;
                    case 2:
                        System.out.print("Enter student ID: ");
                        int studentId = getIntInput(input);

                        System.out.print("Enter student name: ");
                        String studentName = input.nextLine();

                        System.out.print("Enter course code: ");
                        String enrollCourseCode = input.nextLine();

                        break;
                    case 3:
                        System.out.print("Enter student ID: ");
                        int gradeStudentId = getIntInput(input);
                        break;
                    case 4:
                        System.out.print("Enter student ID: ");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        // Handle invalid input and display appropriate error messages
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        } finally {
            System.out.println("Goodbye!");
            // Close the input in a finally block to ensure it's always closed
            input.close();
        }
    }
}