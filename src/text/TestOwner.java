package text;
import java.util.Scanner;

public class TestOwner {

    public static void main(String[] args) {
        Owner owner = new Owner(); // Create a new Owner object
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter the owner's name
        System.out.println("Enter owner name:");
        String ownerName = scanner.nextLine(); // Read the owner's name

        // Prompt the user to enter the owner's ID
        System.out.println("Enter owner ID:");
        int ownerId = scanner.nextInt(); // Read the owner's ID

        scanner.nextLine(); // Consume the leftover newline character

        // Prompt the user to enter the owner's address
        System.out.println("Enter address:");
        String address = scanner.nextLine(); // Read the owner's address

        // Set the owner's details using the provided input
        owner.setOwnerDetails(ownerName, ownerId, address);

        // Print the owner's details by calling the getOwnerDetails() method
        System.out.println("\nOwner Details:");
        System.out.println(owner.getOwnerDetails()); // Print the formatted owner details

        // Close the scanner to free up resources
        scanner.close();
    }
}
