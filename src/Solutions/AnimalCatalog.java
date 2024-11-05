package Solutions;

public class AnimalCatalog 
{
    public static void main(String[] args) 
    {
        // Create Bird instance
        Bird brd = new Bird(0, "", 0);
        System.out.println("Enter Bird Details:");
        brd.input();
        
        // Create Reptile instance
        Reptile rept = new Reptile(0, "", 0.0);
        System.out.println("\nEnter Reptile Details:");
        rept.input();
        
        // Display Bird details
        System.out.println("\nBird Details:");
        brd.output();
        
        // Display Reptile details
        System.out.println("\nReptile Details:");
        rept.output();
    }
}
