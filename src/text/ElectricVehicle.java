package text;
//Vehicale Details using Scanner class.

import java.util.Scanner;

public class ElectricVehicle 
{
   
    String vehicleModel;
    String licensePlate;
    double batteryCapacity;
    double rentalPricePerHour;

    // Method to set the Electric Vehicle details
    public void setElectricVehicleDetails() {
        Scanner vehicle = new Scanner(System.in);
        
        // Prompting user input for vehicle details
        System.out.println("Enter the vehicle model:");
        vehicleModel = vehicle.nextLine();
        
        System.out.println("Enter the license plate:");
        licensePlate = vehicle.nextLine();
        
        System.out.println("Enter the battery capacity (in kWh):");
        batteryCapacity = vehicle.nextDouble();
        
        System.out.println("Enter the rental price per hour:");
        rentalPricePerHour = vehicle.nextDouble();

       
        vehicle.close();
    }

    // Method to print the Electric Vehicle details
    public void getElectricVehicleDetails() {
        System.out.println("\nElectric Vehicle Details:");
        System.out.println("Model: " + vehicleModel);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Rental Price per Hour: $" + rentalPricePerHour);
    }
}
