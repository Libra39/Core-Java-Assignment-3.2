/**
 * 
 */
package Assignment_3;																												// Package Declared		

/**
 * @author khuranas
 *
 */
public class Assignment_3_2 {																										// Name of the Class Declared

/**
 * Write a program in Java to show the use of super and this keyword with a constructor, methods, variables
 * 
 * To Explain the SUPER and THIS keyword with a constructor, methods, variables. I have take the help of the to classes Animal & Cat
 * Animal Class - Have general attributes of Animal like Name, Size, weight and etc
 * Cat Class    - Have all the attributes of the Animal and have additional attributes of it's own.  
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
	public static void main(String[] args) {																						  // Main Method Start
		System.out.println("The Below Results will Show you the SUPER and THIS keyword with a constructor, methods, variables :\n");  // This will print the argument in the next line
		Cat myCat1=new Cat("Lucy", 10,30);																							  // Cat Class constructor and assigned then values
        myCat1.printColor();																										  // object myCat1 is calling the method printColor() of Cat Class	
        myCat1.eat();																												  // object myCat1 is calling the method eat() of Cat Class
        Animal animal=new Animal("Mammals", 20,10);																				      // Animal Class constructor and assigned then values
        animal.displayAnimalsClassParameters();																						  // object animal is calling the method displayAnimalsClassParameters() of Animal Class																	  
        Cat myCat2=new Cat("Kitty",20,40,"Brown");																					  // Cat Class constructor and assigned then values
        myCat2.catDailyRoutine();																									  // object myCat2 is calling the method catDailyRoutine() of Cat Class
	}																																  // Main Method Closed
}																																	  // Assignment_3_2 class closed
