package application;

//Hala Jebreel
//1210606
//Section 3 
//lab section 5
import java.util.*;

public class Delivary extends PizzaOrder {
	//  Delivary class is a sub class from pizza order
	// The attributes for Delivary class 
	private double tripRate;
	private int zone;
	public Delivary(String customerName,  int pizzaSize, int numberOfToppings, double toppingPrice,
			double tripRate, int zone) {
		//non default  constructor  
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		//customerName ,pizzaSize,numberOfToppings and toppingPrice are the attributes for the super class PizzaOrder so call PizzaOrder constructor 
		this.tripRate = tripRate;
		this.zone = zone;
	}
	
	public Delivary() {
		super();
	//default  constructor
	}
	
	//Generate the setters and getters 
	public double getTripRate() {
		return tripRate;
	}

	public void setTripRate(double tripRate) {
		this.tripRate = tripRate;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	@Override
	//to string method which is Override toString method from PizzaOrder
	public String toString() {
		return super.toString()+"\n Trip Rate =  " + tripRate + "\n zone =  " + zone ;
	// return tripRate and zone هn addition to toString in PizzaOrder
	}
	@Override
	//calculateOrderPrice method which is Override from PizzaOrder 
	public double calculateOrderPrice() {
		return super.calculateOrderPrice()+(tripRate/100 *super.calculateOrderPrice() * zone) ;
		
	}

}
