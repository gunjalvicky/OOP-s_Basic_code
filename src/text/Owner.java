package text;

public class Owner {
   
    private String ownerName; // Attribute to store the owner's name
    private int ownerId; // Attribute to store the owner's ID
    private String address; // Attribute to store the owner's address

    // Method to set owner details
    public void setOwnerDetails(String ownerName, int ownerId, String address) {
        this.ownerName = ownerName; // Set the owner's name
        this.ownerId = ownerId; // Set the owner's ID
        this.address = address; // Set the owner's address
    }

    // Method to get owner details as a formatted string
    public String getOwnerDetails() {
        return "Owner Name: " + ownerName + "\n" + // Return owner's name
               "Owner ID: " + ownerId + "\n" + // Return owner's ID
               "Address: " + address; // Return owner's address
    }
}
