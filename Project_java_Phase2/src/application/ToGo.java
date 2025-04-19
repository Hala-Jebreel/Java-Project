package application;
//Hala Jebreel
//1210606
//Section 3 
//lab section 5
import java.util.*;
public class ToGo extends PizzaOrder {
	//ToGo class is a sub class from PizzOrder
	ToGo(String customerName,int  pizzaSize,int numberOfToppings,  double toppingPrice){
		// constructor for To Go class 
		super(customerName,pizzaSize,numberOfToppings,toppingPrice);
		//we use super notation because customerName , pizzaSize , numberOfToppings and toppingPrice are attributes for PizzaOrder and to call the PizzaOrder constructor
		
	}
	

}