package Assignment_3;																				// Package Declared

/**
 * The Cat class will have all the features of the animal class. But cat class can have it's own features
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 * 
 */

public class Cat extends Animal{																	// Class Cat Declared which will inherit the properties of Animal class
    String color="Black";																			// String Variable initialized and assigned the default value "Black"
    public Cat(String name,  int size, int weight) {												// Constructor of Class Cat created inherit the variables of Animal class
        super(name, size, weight);																	// Super keyword is used to 
        System.out.println("Name of the Cat : " + name + "\nSize of the Cat : " + size + " inches\nWeight of the Cat : " + weight + " Kg");} // This will print the argument in the next line
    void printColor(){																				// A method created
        System.out.println("First, Super Keyword invoke Parent Class(Animal Class) constructor(Animal) to initialized same variable in Child Class(Cat Class).\n"+ // This will print the argument in the next line
                            "\nColor of Cat : "+(color)+"\n" +										// Call the variable in the Cat Class
                            "Color of Animal : " +(super.color)+ "\n" +								// call the variable from the Animal Class
                            "Second, Super keyword is used to call variable(colour) of Parent Class(Animal Class) in Child Class(Cat class).\n");} // This will print the argument in the next line
    @Override																						// Constructor overriding is is done  
    void eat() {																					// Same name constructor is create in Cat Class as in Animal Class
        super.eat();																			    // Super KeyWord is used the call the method of Animal class 
        System.out.println("Third, Super Keyword can be used to invoke Parent Class(Animal Class) methods eat() in Child Class(Cat Class).\nIt's called method overriding\n");} // This will print the argument in the next line
    public Cat(String name,  int size, int weight,String color) {									// Cat constructor is again called but with different attributes
        this(name, size, weight);																	// This keyword is used to inherit the arguments of Cat Class
        System.out.printf("Color of Cat : %s%n", color +"\n"+										// call the argument color of cat class  
                            "Second, This Keyword is used to reuse constructor of its own class to initialized same variable.\n");} // This will print the argument in the next line
    private void catlikeFood(){																		// Method is created 
        System.out.println("Cat Like Milk"); }														// This will print the argument in the next line
    void catDailyRoutine(){																			// Method is created
        this.catlikeFood();																			// another method is called in method
        System.out.println("Third, This Keyword can be used to Invoke Child class (Cat Class) methods catlikeFood()\n");} // This will print the argument in the next line
}																									// Cat Class Closed



