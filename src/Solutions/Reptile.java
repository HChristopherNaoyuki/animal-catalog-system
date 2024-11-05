package Solutions;

import java.util.Scanner;

public class Reptile extends Animal 
{
    private double bloodTemp;  // Blood temperature of the reptile
    
    // Constructor
    public Reptile(int IDtag, String species, double bloodTemp) 
    {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }
    
    // Override input method with validation
    @Override
    public void input() 
    {
        Scanner scanner = new Scanner(System.in);
        
        // ID Input with validation
        System.out.print("Enter Reptile ID: ");
        while (!scanner.hasNextInt()) 
        {
            System.out.println("Invalid input. Please enter an integer for Reptile ID.");
            scanner.next(); // Clear the invalid input
        }
        IDtag = scanner.nextInt();
        
        // Species Input
        scanner.nextLine();  // Clear buffer
        System.out.print("Enter Reptile Species: ");
        species = scanner.nextLine();
        
        // Blood Temperature Input with validation
        System.out.print("Enter Reptile Blood Temperature: ");
        while (!scanner.hasNextDouble()) 
        {
            System.out.println("Invalid input. Please enter a decimal number for Blood Temperature.");
            scanner.next(); // Clear the invalid input
        }
        bloodTemp = scanner.nextDouble();
    }
    
    // Override output method
    @Override
    public void output() 
    {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp + " Degrees Celsius");
    }
}
