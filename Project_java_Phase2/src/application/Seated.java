package application;
//Hala Jebreel
//1210606
//Section 3 
//lab section 5
import java.util.*;

public class Seated extends PizzaOrder {
	//Seated is a sub class from PizzaOrder
	//the attributes for Seated class
	private double serviceCharge ;
	private int numberOfPeople ;
	
	public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice,
			double serviceCharge, int numberOfPeople) {
		//non default constructor 
		super(customerName,  pizzaSize, numberOfToppings, toppingPrice);
		//use super notation because customerName,  pizzaSize, numberOfToppings and  toppingPrice are a attributes for PizzaOrder Class  
		this.serviceCharge = serviceCharge;
		this.numberOfPeople = numberOfPeople;
	}
	@Override
	public String toString() {
		//toString method which is Override from PizzaOrder class
		return "serviceCharge = " + serviceCharge + " numberOfPeople = " + numberOfPeople ;
		//return serviceCharge and numberOfPeople
	}
	@Override
	public double calculateOrderPrice() {
		//method calculateOrderPrice  which is Override from PizzaOrder class
		return super.calculateOrderPrice() + serviceCharge * numberOfPeople ;
	}
	

}