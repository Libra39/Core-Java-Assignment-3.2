/**
 * 
 */
package Assignment_3;																					// Package Declared

/**
 * @author khuranas
 *
 * There are basically 6 type of animals
 * Mammals	     - Example - cat, tiger etc
 * Birds 	     - Example - parrot, pigeon, etc
 * Reptiles      - Example - Snake, Turtle, etc
 * Amphibians    - Example - Frog, etc
 * Fish 	     - Example - gold Fish, etc
 * Invertebrates - Example - includes insects, worms, arthropods, sponges, mollusks, octopuses, etc
 *
 * In Animal class we are going to list down the basic attributes of all pet animals have 
 * like Name, Size,weight and color ..
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */

public class Animal {																						// Class Declared
    private String Name;																					// Private String Variable Name initialized
    private int size;																						// Private Integer Variable size initialized																						
    private int weight;																						// Private String Variable weight initialized
    public String color="Default";																		    // Public String Variable color initialized and "Default" string value is assigned to it.
    public Animal(String Name, int size, int weight) {                									    // Animal Constructor initialized as parameters arguments and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.
        this.Name=Name;																						// This keyword to distinguish local variable and instance variable.
        this.size=size;																						// This keyword to distinguish local variable and instance variable.
        this.weight=weight;	}																				// This keyword to distinguish local variable and instance variable. 
    void displayAnimalsClassParameters(){																	// Method is declared 
        System.out.println("Type of the Animal : "+Name+ "\nSize of the Animal : "+size+ " inches\nWeight of the Animal : "+weight+ " Kg"+ // This will print the argument in the next line
                            "\nFirst, This keyword is used to distinguish between local variable and instance variable.\n");}
     void eat(){																							// Method is declared
        System.out.println("All Animals Eat");}																// This will print the argument in the next line
}																											// Animal Class Closed

