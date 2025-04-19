package application;
//Hala Jebreel
//1210606
//Section 3 
//lab section 5
import java.util.*; 

public class Dreviar {
	
	public static void main(String[] args) {
		
		ArrayList<PizzaOrder> orders =new ArrayList<>();
		//Create Array list called orders
		orders.add(new Delivary("Ahmad",PizzaOrder.LARGE,3,10,10,3));
		//we add to the array list in the  0 index (customerName,  pizzaSize, numberOfToppings, toppingPrice, tripRate, zone)
		orders.add(new Delivary("Suha",PizzaOrder.MEDIUM,2,5,20,2));
		//we add to the array list in the  1 index (customerName,pizza size , numberOfToppings ,  toppingPrice ,  tripRate, zone)
		orders.add(new ToGo("Ribhi", PizzaOrder.MEDIUM,4,5));
		//we add to the array list in the  2 index (customerName, pizzaSize, numberOfToppings, toppingPrice)
		orders.add(new Seated("Rana", PizzaOrder.SMALL,3,1,2,3));
		//we add to the array list in the  3 index (customerName,  pizzaSize, numberOfToppings, toppingPrice, serviceCharge, numberOfPeople)
		orders.add(new Seated("Jamal", PizzaOrder.LARGE,4,2,4,5));
		//we add to the array list in the 4 index (customerName,  pizzaSize, numberOfToppings, toppingPrice, serviceCharge, numberOfPeople)
		sortOrders(orders);
		// call sortOrders method 
		for (int i=0;i<orders.size();i++) {
			orders.get(i).printOrderInfo();
		// for loop to go to every index in the array list and called printOrderInfo method to print the name of the customer and the price   
		}
		System.out.println(" \n ");
		System.out.println(" Total sum of Order Prices =  " +calculateTotalOrdersPrice(orders));
		//print the total orders price 
		System.out.println(" \n ");
		System.out.println(orders.get(1).toString()+ " \n order price : " +orders.get(1).calculateOrderPrice());
		//print the to string for index 1 in array list and order price
   
	}
	public static double calculateTotalOrdersPrice(ArrayList<PizzaOrder>arr) {
		// calculateTotalOrdersPrice method which is return the total price for all order
		double count =0;
		for (int i=0 ; i<arr.size() ;i++) {
			count = count + arr.get(i).calculateOrderPrice();
		}
		return count;
		//return the sum of all order price
	}
	public static void sortOrders (ArrayList<PizzaOrder>arr) {
		//sortOrder method with take an array list and sort it 
		Collections.sort(arr);
	}

}
