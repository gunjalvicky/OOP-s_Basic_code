
package text;
public class Planet {
    
    private String planetName;
    private double mass;      
    private double radius;   
   
    
    public void setPlanetDetails(String planetName, double mass, double radius) {
        this.planetName = planetName;
        this.mass = mass;
        this.radius = radius;
    }

    
    public String getPlanetDetails() {
        return "Planet Name: " + planetName + "\n" +
               "Mass: " + mass + " kg\n" +
               "Radius: " + radius + " km";
    }
}
