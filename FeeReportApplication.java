import java.util.Scanner;

public class FeeReportApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FeeReport feeReport = new FeeReport();

        System.out.println("Welcome to the Fee Report Application!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Pay Fees");
            System.out.println("3. View Fee Report");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the student:");
                    String name = scanner.nextLine();
                    feeReport.addStudent(name);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("Enter the name of the student:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter the amount to pay:");
                    double amount = scanner.nextDouble();
                    feeReport.payFees(studentName, amount);
                    break;
                case 3:
                    feeReport.generateReport();
                    break;
                case 4:
                    System.out.println("Thank you for using the Fee Report Application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
