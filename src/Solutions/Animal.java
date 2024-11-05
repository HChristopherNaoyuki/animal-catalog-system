package Solutions;

public class Animal 
{
    protected int IDtag;
    protected String species;
    
    // Constructor
    public Animal(int IDtag, String species) 
    {
        this.IDtag = IDtag;
        this.species = species;
    }
    
    // Default input method to be overridden
    public void input() 
    {
        System.out.println("Enter animal details:");
    }
    
    // Default output method to be overridden
    public void output() 
    {
        System.out.println("Animal ID: " + IDtag);
        System.out.println("Species: " + species);
    }
}
