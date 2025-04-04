package text;
import java.util.Scanner;

public class TestPlanet {
    public static void main(String[] args) {
        // Create an instance of Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Planet
        Planet planet = new Planet();

        
        System.out.println("Enter the name of the planet:");
        String planetName = scanner.nextLine();
        
        System.out.println("Enter the mass of the planet (in kilograms):");
        double mass = scanner.nextDouble();
        
        System.out.println("Enter the radius of the planet (in kilometers):");
        double radius = scanner.nextDouble();

       
        planet.setPlanetDetails(planetName, mass, radius);

        
        System.out.println("\nPlanet Details:");
        System.out.println(planet.getPlanetDetails());

       
        scanner.close();
    }
}
