//Rashika Jain
//10-25-24 Per. 5
/*
FoodTester.java
This program uses the main method to print the final output.
*/

public class FoodTester
{
	public static void main (String [] args)
	{
		Food food1 = new Food ("baked", "banana", "muffins"); //instantiates Food3 to create food1 and uses values for muffins
		food1.printForSale(); //prints line for muffins
		Food food2 = new Food ("fried", "yam", "fritters"); //instantiates Food3 to create food2 and uses values for fritters
		food2.printForSale(); //prints line for fritters
		Pizza pizza = new Pizza ("pepperoni"); //instantiates Pizza3 to create the pizza without cost or amount
		pizza.printForSale(); //prints line for pizzas
	}
}
