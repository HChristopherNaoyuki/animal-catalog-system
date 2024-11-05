package Solutions;

import java.util.Scanner;

public class Bird extends Animal 
{
    private int color;  // Feather color (1=gray, 2=white, 3=black)
    
    // Constructor
    public Bird(int IDtag, String species, int color) 
    {
        super(IDtag, species);
        this.color = color;
    }
    
    // Override input method with validation
    @Override
    public void input() 
    {
        Scanner scanner = new Scanner(System.in);
        
        // ID Input with validation
        System.out.print("Enter Bird ID: ");
        while (!scanner.hasNextInt()) 
        {
            System.out.println("Invalid input. Please enter an integer for Bird ID.");
            scanner.next(); // Clear the invalid input
        }
        IDtag = scanner.nextInt();
        
        // Species Input
        scanner.nextLine();  // Clear buffer
        System.out.print("Enter Bird Species: ");
        species = scanner.nextLine();
        
        // Color Input with validation
        System.out.print("Enter Bird Color \n1: Gray \n2: White \n3: Black \nEnter Choice: ");
        while (!scanner.hasNextInt()) 
        {
            System.out.println("Invalid input. Please enter an integer for Color.");
            scanner.next(); // Clear the invalid input
        }
        color = scanner.nextInt();
    }
    
    // Override output method
    @Override
    public void output() 
    {
        super.output();
        System.out.println("Feather Color Code: " + color);
    }
}
