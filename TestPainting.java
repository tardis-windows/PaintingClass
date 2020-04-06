/*
 *  Assignment 1: Csc 221
 *  Tamara Pando 
 */

public class TestPainting {

	public static void main(String[] args) {
		
		
		// Create new object using default constructor and prints new object
		Painting obj1 = new Painting(); 
		
		System.out.printf("%s%n","Default constructor set");
		obj1.printPaintingInfo(obj1);		// this method prints the entire instance of the object 
											// defined in Painting class 
		
		// Updates object that was already created with default constructor
		System.out.printf("%s%n", "Updated Object info");
		obj1.updateObj(obj1,"Mark Rothko", "No.6 (Violet, Green, Red)", 186000000, 1951); 
		obj1.printPaintingInfo(obj1);
		
		
		// Create new object using non-default constructor, print new object 
		Painting obj2 = new Painting("Mark Rothko", "No.6 (Violet, Green, Red)", 186000000, 1951);	
		System.out.printf("%s%n", "Object created with non-default constructor");
		obj2.printPaintingInfo(obj2);
		
		
		// Create new object and use Scanner to ask user for input information
		System.out.printf("%n%n%s%n", "Using scanner class");
		
		Painting obj3 = new Painting(); 
		obj3.inputInfo(obj3); 			// this method uses the scanner class to prompt the user for the painting info 
										// defined in the Painting class 
		obj3.printPaintingInfo(obj3);	
	}
}
