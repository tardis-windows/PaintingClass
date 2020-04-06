/*
 * member variables: 
 * artistName: private String
 * name : private String
 * price: private double
 * year : private int
 * 
 *	constructors
 * default constructor: initialize string variable to "-" and numeric variables 
 * to 0
 * non-default constructor: accepts 4 parameters to initialize the 4 private 
 * variables 
 * setters + getters 
 * 
 * class methods
 * getMinimumDiscountPrice, returns price discounted by 15%
 * getMaximumDiscountPrice, returns price discounted by 10%
 * getAge, returns the age of the painting uses Gregorian calendar etc
 */

import java.util.GregorianCalendar; 
import java.util.Calendar;
import java.util.Scanner;

public class Painting {
	
	private String artistName, name; 
	private double price; 
	private int year; 
	
	// default constructor
	public Painting() {
		artistName = "-";
		name = "-"; 
		price = 0; 
		year = 0; 
	}
	
	// non-default constructor
	public Painting(String newArtistName, String newName, double newPrice, int newYear) {
		setArtistName(newArtistName);
		setName(newName); 
		setPrice(newPrice); 
		setYear(newYear); 
	}
	
	//setters
	public void setArtistName(String artistName) {
		this.artistName = artistName; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	public void setYear(int year) {
		this.year = year; 
	}
	
	// getters
	public String getArtistName() {
		return artistName; 
	}
	
	public String getName() {
		return name; 
	}
	
	public double getPrice() {
		return price; 
	}
	
	public int getYear() {
		return year;
	}
	
	// Methods for Discount 
	
	public double getMinimumDiscountPrice() {
		
		double discountedPrice = price; 
		
		discountedPrice = discountedPrice - ((discountedPrice*15)/100);
		return discountedPrice; 
	}
	
	public double getMaximuDiscountPrice() {
		
		double discountedPrice = price; 
		
		discountedPrice = discountedPrice - ((discountedPrice*10)/100); 
		return discountedPrice; 
	}
	
	public int getAge() {
		
		int age; 
		Calendar calendar = new GregorianCalendar();
		age = calendar.get(Calendar.YEAR) - year; 
		
		return age; 
	}
	
	// custom methods 
	
	// Method to update existing object 
	public Painting updateObj(Painting obj, String Artist, String Name, double Price, int Year){
		
		obj.setArtistName(Artist);
		obj.setName(Name);
		obj.setPrice(Price);
		obj.setYear(Year);
		return obj; 
	}
	
	// Method for printing objects  
	
	public void printPaintingInfo(Painting obj) {
		System.out.printf("%n%24s%s%n","Artist Name: ", obj.getArtistName());
		System.out.printf("%24s%s%n", "Name: ", obj.getName());
		System.out.printf("%24s%,2.2f%n", "Price: ", obj.getPrice());
		System.out.printf("%24s%d%n", "Year: ", obj.getYear());
		System.out.printf("%24s%d%n", "Age: ", obj.getAge());
		System.out.printf("%24s%,2.2f%s%,2.2f%n%n", "Discount Price Range: ",obj.getMinimumDiscountPrice(), " - ",obj.getMaximuDiscountPrice());
	}
	
	
	// Method to prompt user to input data 
	
	public Painting inputInfo(Painting obj) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("%n%s","Artist Name: ");
		String Artist = scanner.nextLine(); 
		System.out.print("Name: "); 
		String Name = scanner.nextLine(); 
		System.out.print("Price: ");
		double Price = scanner.nextDouble(); 
		System.out.print("Year: ");
		int Year = scanner.nextInt(); 
		
		scanner.close();
		
		obj.setArtistName(Artist);
		obj.setName(Name);
		obj.setPrice(Price);
		obj.setYear(Year);
		
		return obj; 
	}
}
