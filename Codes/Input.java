import java.util.Scanner; // Import Scanner class

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt(); // Read an integer input

        System.out.println("You entered: " + number); // Output the entered integer

        scanner.close(); // Close the scanner
    }
}
