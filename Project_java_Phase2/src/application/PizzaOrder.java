package application;
//Hala Jebreel
//1210606
//Section 3 
//lab section 5
import java.util.*;

public class PizzaOrder implements Comparable <PizzaOrder> {
	//super class which is implements the comparable interface
	//the attributes for PizzaOrder class
	private String 	customerName ;
	private Date dateOrdered;
	private int pizzaSize ;
	private int numberOfToppings ;
	private double 	toppingPrice ;
	final static int SMALL = 1 ;
	final static int MEDIUM = 2;
	final static int LARGE = 3;
	public PizzaOrder(String customerName,  int pizzaSize, int numberOfToppings, double toppingPrice) {
		//non default constructor 
		super();
		this.customerName = customerName;
		dateOrdered = new Date();//date order = todays date
		this.pizzaSize = pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
	}
	public PizzaOrder() {
		//default constructor 
		super();
		//super class for PizzaOrder by default is Object class
	}
	//Generate the setters and getters 
	public String getCustomerName() {
		return customerName;
		
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		
	}
	public Date getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public String getPizzaSize() {
		if(pizzaSize==1) 
		//if pizza size is 1 return small
			return "Small";
		else if(pizzaSize==2)
			return "Medium";
		//if pizza size is 2 return Medium
		else 
		//else return pizza size large
		return "Large";
	}
	public void setPizzaSize(int pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public int getNumberOfToppings() {
		return numberOfToppings;
	}
	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}
	public double getToppingPrice() {
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	@Override
	public String toString() {
		// toString method  which is return all the attributes for the class (PizzaOrder Class)
		return " Customer Name =  " + customerName + " \n Date Ordered =  " + dateOrdered + " \n Pizza Size =  " + getPizzaSize() 
				+ "\n Number Of Toppings = " + numberOfToppings + "\n Topping Price = " + toppingPrice  ;
	}
	public double calculateOrderPrice() {
		//calculateOrderPrice method which is return the price of the order 
		return ( numberOfToppings * toppingPrice ) * pizzaSize;
	}
	public void printOrderInfo () {
		//printOrderInfo method which is print only the customer name and the order price for his/her order
		System.out.println( " " + customerName + "    " +calculateOrderPrice());
		
	}

	@Override
	// The class PizzaOrder implement the comparable interface we must Override the compareTo method 
	public int compareTo(PizzaOrder o){
		// compareTo method take an object 
		if (calculateOrderPrice()>o.calculateOrderPrice()) 
			return 1;
		else if (calculateOrderPrice()<o.calculateOrderPrice())
			return -1;
		else
		return 0;
	}
}